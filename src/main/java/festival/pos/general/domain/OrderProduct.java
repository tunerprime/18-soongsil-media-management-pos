package festival.pos.general.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="mp_order_product")
public class OrderProduct {
	
	@Id
	@GeneratedValue
	private Long orderProductId;
	
	@Column(nullable=false)
	private Integer productCount;
	
	@Column(nullable=false)
	private OrderProductStatus orderProductStatus;
	
	@Column(nullable=false)
	private boolean deleteYn;
	
	@ManyToOne(cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
	@JoinColumn(name="order_id")
	@JsonIgnore
	private Order order;
	
	@OneToOne(cascade=CascadeType.PERSIST, orphanRemoval=false)
	@JoinColumn(name="product_id")
	private Product product;

	public Long getOrderProductId() {
		return orderProductId;
	}

	public void setOrderProductId(Long orderProductId) {
		this.orderProductId = orderProductId;
	}

	public Integer getProductCount() {
		return productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}

	public OrderProductStatus getOrderProductStatus() {
		return orderProductStatus;
	}

	public void setOrderProductStatus(OrderProductStatus orderProductStatus) {
		this.orderProductStatus = orderProductStatus;
	}
	
	public boolean isDeleteYn() {
		return deleteYn;
	}

	public void setDeleteYn(boolean deleteYn) {
		this.deleteYn = deleteYn;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
