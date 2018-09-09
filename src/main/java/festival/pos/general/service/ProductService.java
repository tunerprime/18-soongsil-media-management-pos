package festival.pos.general.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import festival.pos.general.domain.ProductGroup;
import festival.pos.general.repository.ProductGroupRepository;

@Service
public class ProductService {

	@Autowired
	private ProductGroupRepository productGroupRepository;
	
	public List<ProductGroup> findAll() {
		return productGroupRepository.findAll();
	}
}
