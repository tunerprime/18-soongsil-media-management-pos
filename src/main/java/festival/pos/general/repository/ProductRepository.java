package festival.pos.general.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import festival.pos.general.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> { }
