package festival.pos.general.service;

import java.util.List;

import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import festival.pos.general.domain.Product;
import festival.pos.general.repository.ProductRepository;
import festival.pos.general.result.ProductListResult;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository; 
	
	/**
	 * <pre>
	 * @Date : 2018. 9. 8.
	 * @author "유한욱(Cary)"
	 * @History : 
	 * @Description : 상품 목록 조회
	 * </pre>
	 *
	 * @return
	 */
	public List<ProductListResult> findAll() {
		
		List<Product> list = productRepository.findAll();
		
		return list.stream().map(ProductListResult::new).collect(Collectors.toList());
	}
}
