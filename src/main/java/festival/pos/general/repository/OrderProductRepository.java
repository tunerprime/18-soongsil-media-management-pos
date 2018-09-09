package festival.pos.general.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import festival.pos.general.domain.OrderProduct;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> { }
