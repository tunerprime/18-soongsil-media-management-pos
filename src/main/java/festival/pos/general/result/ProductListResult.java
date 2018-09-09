package festival.pos.general.result;

import festival.pos.general.domain.Product;

public class ProductListResult {

	private Long id;
	
	// 상품명
	private String productName;
	
	// 원가
	private Integer originAmount;
	
	// 판매가
	private Integer salesAmount;
	
	public ProductListResult(Product product) {
		this.id = product.getId();
		this.productName = product.getProductName();
		this.originAmount = product.getOriginAmount();
		this.salesAmount = product.getSalesAmount();
	}

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
