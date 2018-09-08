package mikyeong.pos.general.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mikyeong.pos.general.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> { }
