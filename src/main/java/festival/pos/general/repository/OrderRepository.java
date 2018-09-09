package festival.pos.general.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import festival.pos.general.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> { }
