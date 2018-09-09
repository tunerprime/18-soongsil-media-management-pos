package festival.pos.general.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import festival.pos.general.domain.OrderInfo;
import festival.pos.general.domain.OrderType;

public interface OrderInfoRepository extends JpaRepository<OrderInfo, Long> { 
	
	public List<OrderInfo> findByOrderInfoType(OrderType orderType);
	
}
