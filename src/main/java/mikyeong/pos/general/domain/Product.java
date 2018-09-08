package mikyeong.pos.general.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue
	private Long id;
	
	// 상품 명
	@Column(nullable=false)
	private String productName;
	
	// 원가
	@Column(nullable=false)
	private Integer originAmount;
	
	// 판매가
	@Column(nullable=false)
	private Integer salesAmount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getOriginAmount() {
		return originAmount;
	}

	public void setOriginAmount(Integer originAmount) {
		this.originAmount = originAmount;
	}

	public Integer getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(Integer salesAmount) {
		this.salesAmount = salesAmount;
	}
}
