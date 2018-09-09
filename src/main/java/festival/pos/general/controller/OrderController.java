package festival.pos.general.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import festival.pos.general.domain.Order;
import festival.pos.general.domain.OrderInfo;
import festival.pos.general.domain.OrderType;
import festival.pos.general.param.OrderRegistParam;
import festival.pos.general.service.OrderService;

@RestController
@RequestMapping("/api/v1/orders")
@CrossOrigin("*")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("info")
	public ResponseEntity<List<OrderInfo>> tables() {
		
		List<OrderInfo> list = orderService.findAll();
		
		return ResponseEntity.ok(list);
	}
	
	@PostMapping
	public ResponseEntity<Order> regist(@RequestBody OrderRegistParam param) {
		
		Order order = orderService.regist(param);
		
		return new ResponseEntity<Order>(order, HttpStatus.CREATED);
	}
	
	@GetMapping("{orderId}")
	public ResponseEntity<Order> findOne(@PathVariable("orderId") Long orderId) {
		Order order = orderService.findOne(orderId);
		
		return ResponseEntity.ok(order);
	}
}
