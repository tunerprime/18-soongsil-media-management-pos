package festival.pos.general.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import festival.pos.general.domain.Order;
import festival.pos.general.domain.OrderInfo;
import festival.pos.general.domain.OrderProduct;
import festival.pos.general.domain.OrderProductStatus;
import festival.pos.general.domain.Product;
import festival.pos.general.param.OrderProductRegistParam;
import festival.pos.general.param.OrderRegistParam;
import festival.pos.general.repository.OrderInfoRepository;
import festival.pos.general.repository.OrderRepository;
import festival.pos.general.repository.ProductRepository;

@Service
public class OrderService {

	@Autowired
	private OrderInfoRepository orderInfoRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<OrderInfo> findAll() {
		return orderInfoRepository.findAll();
	}
	
	public Order findOne(Long orderId) {
		return orderRepository.findOne(orderId);
	}
	
	@Transactional
	public OrderInfo exitOrderInfo(Long orderInfoId) {
		OrderInfo orderInfo = orderInfoRepository.findOne(orderInfoId);
		
		// 상태 변경
		orderInfo.setUseYn(false);
		orderInfo.setInfoBeginDate(null);
		
		orderInfo.getOrders().stream().forEach(x-> {
			x.setOrderSuccessYn(true);
		});
		
		return orderInfo;
	}
	
	@Transactional
	public Order regist(OrderRegistParam param) {
		
		// 주문상태 변경
		OrderInfo orderInfo = orderInfoRepository.findOne(param.getOrderInfoId());
		
		orderInfo.setUseYn(true);
		
		// 시간 설정
		if(orderInfo.getInfoBeginDate() == null) {
			orderInfo.setInfoBeginDate(new Date());
		}
		
		Order order = new Order();
		
		order.setOrderType(orderInfo.getOrderInfoType());
		order.setOrderOwnerName(param.getOrderOwnerName());
		order.setOrderDate(new Date());
		order.setOrderInfo(orderInfo);
		order.setReceiveAmount(param.getReceiveAmount());
		
		List<OrderProduct> orderProducts = new ArrayList<OrderProduct>();
		
		for(OrderProductRegistParam bean : param.getProducts()) {
			OrderProduct orderProduct = new OrderProduct();
			
			Product product = productRepository.findOne(bean.getProductId());
			
			orderProduct.setOrder(order);
			orderProduct.setProduct(product);
			orderProduct.setProductCount(bean.getProductCount());
			orderProduct.setOrderProductStatus(OrderProductStatus.ORDER_COMPLETE);
			
			orderProducts.add(orderProduct);
		}
		
		order.setOrderProducts(orderProducts);
		
		return orderRepository.save(order);
	}
	
	@Transactional
	public Order changeStatus(Long orderId, Long productId) {
		Order order = orderRepository.findOne(orderId);
		
		OrderProduct orderProduct = order.getOrderProducts()
				.stream().filter(x-> x.getProduct().getProductId().equals(productId))
				.findFirst().orElse(null);
		
		if(orderProduct.getOrderProductStatus().equals(OrderProductStatus.ORDER_COMPLETE)) {
			orderProduct.setOrderProductStatus(OrderProductStatus.COOK_ING);
		} else if(orderProduct.getOrderProductStatus().equals(OrderProductStatus.COOK_ING)) {
			orderProduct.setOrderProductStatus(OrderProductStatus.COOK_END);
		}
		
		return order;
	}
	
	@Transactional
	public Order completePayment(Long orderId) {
		Order order = orderRepository.findOne(orderId);
		
		order.setOrderPaymentYn(true);
		
		return order;
	}
	
	@Transactional
	public void removeOrder(Long orderId) {
		orderRepository.delete(orderId);
	}
	
	@Transactional
	public void removeOrdersProducts(Long orderId, Long productId) {
		Order order = orderRepository.findOne(orderId);
		
		OrderProduct orderProduct = order.getOrderProducts()
				.stream().filter(x-> x.getProduct().getProductId().equals(productId))
				.findFirst().orElse(null);
		
		orderProduct.setDeleteYn(true);
	}
}
