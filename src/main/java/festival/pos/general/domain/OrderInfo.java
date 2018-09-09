package festival.pos.general.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Entity
@Table(name="mp_order_info")
public class OrderInfo {
	
	@Id
	@GeneratedValue
	private Long orderInfoId;
	
	@Column(nullable=false)
	private OrderType orderInfoType;
	
	@Column(nullable=false)
	private Integer orderInfoNo;
	
	@Column(nullable=false)
	private boolean useYn;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.LAZY, mappedBy="orderInfo")
	@Where(clause="order_success_yn = false")
	private List<Order> orders;

	public Long getOrderInfoId() {
		return orderInfoId;
	}

	public void setOrderInfoId(Long orderInfoId) {
		this.orderInfoId = orderInfoId;
	}

	public Integer getOrderInfoNo() {
		return orderInfoNo;
	}
	
	public void setOrderInfoNo(Integer orderInfoNo) {
		this.orderInfoNo = orderInfoNo;
	}

	public OrderType getOrderInfoType() {
		return orderInfoType;
	}

	public void setOrderInfoType(OrderType orderInfoType) {
		this.orderInfoType = orderInfoType;
	}
	
	public boolean isUseYn() {
		return useYn;
	}

	public void setUseYn(boolean useYn) {
		this.useYn = useYn;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
