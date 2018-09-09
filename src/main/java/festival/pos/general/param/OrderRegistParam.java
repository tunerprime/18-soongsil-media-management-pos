package festival.pos.general.param;

import java.util.List;

public class OrderRegistParam {
	
	private Long orderInfoId;
	private String orderOwnerName;
	
	private List<OrderProductRegistParam> products;

	public Long getOrderInfoId() {
		return orderInfoId;
	}

	public void setOrderInfoId(Long orderInfoId) {
		this.orderInfoId = orderInfoId;
	}

	public String getOrderOwnerName() {
		return orderOwnerName;
	}

	public void setOrderOwnerName(String orderOwnerName) {
		this.orderOwnerName = orderOwnerName;
	}

	public List<OrderProductRegistParam> getProducts() {
		return products;
	}

	public void setProducts(List<OrderProductRegistParam> products) {
		this.products = products;
	}
}
