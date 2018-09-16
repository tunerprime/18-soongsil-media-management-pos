package festival.pos.general.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="mp_order")
public class Order {

	@Id
	@GeneratedValue
	private Long orderId;
	
	@Column(nullable=false)
	private boolean orderPaymentYn;
	
	@Column(nullable=false)
	private OrderType orderType;
	
	@Column(nullable=false)
	private boolean orderSuccessYn;
	
	@Column(nullable=false)
	private String orderOwnerName;
	
	@Column(nullable=false)
	private Date orderDate;
	
	@ManyToOne(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
	@JoinColumn(name="order_info_id")
	@JsonIgnore
	private OrderInfo orderInfo;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.LAZY, mappedBy="order")
	@Where(clause="delete_yn = false")
	private List<OrderProduct> orderProducts;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public boolean isOrderPaymentYn() {
		return orderPaymentYn;
	}

	public void setOrderPaymentYn(boolean orderPaymentYn) {
		this.orderPaymentYn = orderPaymentYn;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

	public boolean isOrderSuccessYn() {
		return orderSuccessYn;
	}

	public void setOrderSuccessYn(boolean orderSuccessYn) {
		this.orderSuccessYn = orderSuccessYn;
	}

	public String getOrderOwnerName() {
		return orderOwnerName;
	}

	public void setOrderOwnerName(String orderOwnerName) {
		this.orderOwnerName = orderOwnerName;
	}

	public OrderInfo getOrderInfo() {
		return orderInfo;
	}
	
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public void setOrderInfo(OrderInfo orderInfo) {
		this.orderInfo = orderInfo;
	}

	public List<OrderProduct> getOrderProducts() {
		return orderProducts;
	}

	public void setOrderProducts(List<OrderProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}
}
