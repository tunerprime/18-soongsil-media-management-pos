package festival.pos.general.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="mp_product")
public class Product {
	
	@Id
	@GeneratedValue
	private Long productId;
	
	@Column(nullable=false)
	private String productName;
	
	@Column(nullable=false)
	private Integer originAmount;
	
	@Column(nullable=false)
	private Integer salesAmount;
	
	@Column(nullable=false)
	private boolean soldoutYn;
	
	@Column(nullable=false)
	private boolean productAutoCookingCompleteYn;
	
	@ManyToOne(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
	@JoinColumn(name="product_group_id")
	@JsonIgnore
	private ProductGroup productGroup;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
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

	public boolean isSoldoutYn() {
		return soldoutYn;
	}

	public void setSoldoutYn(boolean soldoutYn) {
		this.soldoutYn = soldoutYn;
	}

	public ProductGroup getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(ProductGroup productGroup) {
		this.productGroup = productGroup;
	}

	public boolean isProductAutoCookingCompleteYn() {
		return productAutoCookingCompleteYn;
	}

	public void setProductAutoCookingCompleteYn(boolean productAutoCookingCompleteYn) {
		this.productAutoCookingCompleteYn = productAutoCookingCompleteYn;
	}
}
