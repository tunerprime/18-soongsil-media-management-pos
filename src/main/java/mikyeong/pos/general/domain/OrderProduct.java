package mikyeong.pos.general.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class OrderProduct {

	// 주문 수
	@Column(nullable=false)
	private Integer productOrderCount;
	
	// 상품
	@OneToOne(cascade=CascadeType.ALL, orphanRemoval=false)
	@JoinColumn(name="id")
	private Product product;
	
	// 주문
	@ManyToOne(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
	@JoinColumn(name="id")
	private Order order;

	public Integer getProductOrderCount() {
		return productOrderCount;
	}

	public void setProductOrderCount(Integer productOrderCount) {
		this.productOrderCount = productOrderCount;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
