package mikyeong.pos.general.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="order")
public class Order {
	
	@Id
	@GeneratedValue
	private Long id;
	
	// 총 결제 금액
	@Column(nullable=false)
	private Integer totalAmount;
	
	// 주문일시
	@Column(nullable=false)
	private Date orderDate;

	// 주문 상품
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.LAZY, mappedBy="user")
	@JsonIgnore
	private List<OrderProduct> orderProducts;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public List<OrderProduct> getOrderProducts() {
		return orderProducts;
	}

	public void setOrderProducts(List<OrderProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}
}
