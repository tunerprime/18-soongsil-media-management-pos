package festival.pos.general.service;


import festival.pos.general.domain.Order;
import festival.pos.general.domain.OrderInfo;
import festival.pos.general.domain.OrderProduct;
import festival.pos.general.domain.OrderProductStatus;
import festival.pos.general.domain.OrderType;
import festival.pos.general.domain.Product;
import festival.pos.general.param.OrderProductRegistParam;
import festival.pos.general.param.OrderRegistParam;
import festival.pos.general.repository.OrderInfoRepository;
import festival.pos.general.repository.OrderRepository;
import festival.pos.general.repository.ProductRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public Order regist(OrderRegistParam param) {
		
		// 주문상태 변경
		OrderInfo orderInfo = orderInfoRepository.findOne(param.getOrderInfoId());
		
		orderInfo.setUseYn(true);
		
		Order order = new Order();
		
		order.setOrderType(orderInfo.getOrderInfoType());
		order.setOrderOwnerName(param.getOrderOwnerName());
		order.setOrderDate(new Date());
		order.setOrderInfo(orderInfo);
		
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
}
