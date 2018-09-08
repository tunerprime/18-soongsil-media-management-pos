package mikyeong.pos.general.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mikyeong.pos.general.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> { }