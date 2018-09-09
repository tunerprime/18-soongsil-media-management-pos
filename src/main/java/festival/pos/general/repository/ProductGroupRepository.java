package festival.pos.general.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import festival.pos.general.domain.ProductGroup;

public interface ProductGroupRepository extends JpaRepository<ProductGroup, Long> { }
