package net.javaguides.springboot.controller;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Order;
import net.javaguides.springboot.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    // get all employees
	@GetMapping("/order")
	public List<Order> getAllOrder(){
		return orderRepository.findAll();
	}

    // create employee rest api
    @PostMapping("/order")
    public Order orderCake(@RequestBody Order order) {
        return orderRepository.save(order);
    }




    // get employee by id rest api
//	@GetMapping("/employees/{id}")
//	public ResponseEntity<Doctor> getEmployeeById(@PathVariable Long id) {
//		Doctor employee = employeeRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
//		return ResponseEntity.ok(employee);
//	}

    // update employee rest api

	@PutMapping("/order/{id}")
	public ResponseEntity<Order> updateOrder(@PathVariable Long id, @RequestBody Order orderDetails){
		Order order = orderRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

		order.setName(orderDetails.getName());
		order.setAddress(orderDetails.getAddress());
		order.setMobile(orderDetails.getMobile());
        order.setCakeName(orderDetails.getCakeName());
        order.setCakeText(orderDetails.getCakeText());
        order.setDeliverDate(orderDetails.getDeliverDate());
        order.setStatus(orderDetails.getStatus());
        order.setCurrentDate(orderDetails.getCurrentDate());
        order.setQuantity(orderDetails.getQuantity());
        order.setAmount(orderDetails.getAmount());
		Order updatedOrder = orderRepository.save(order);
		return ResponseEntity.ok(updatedOrder);
	}

    // delete employee rest api
//	@DeleteMapping("/employees/{id}")
//	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
//		Doctor employee = employeeRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
//
//		employeeRepository.delete(employee);
//		Map<String, Boolean> response = new HashMap<>();
//		response.put("deleted", Boolean.TRUE);
//		return ResponseEntity.ok(response);
//	}


}
