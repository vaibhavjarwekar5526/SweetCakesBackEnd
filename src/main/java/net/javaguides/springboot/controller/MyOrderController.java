package net.javaguides.springboot.controller;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.MyOrder;
import net.javaguides.springboot.model.Order;
import net.javaguides.springboot.repository.MyOrderRepository;
import net.javaguides.springboot.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class MyOrderController {

    @Autowired
    private MyOrderRepository myOrderRepository;






    // get employee by id rest api
	@GetMapping("/myorder/{mobile}")
	public ResponseEntity<MyOrder> getEmployeeById(@PathVariable String mobile) {
		MyOrder myOrder = myOrderRepository.findById(mobile)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + mobile));
		return ResponseEntity.ok(myOrder);
	}

    // update employee rest api

//	@PutMapping("/employees/{id}")
//	public ResponseEntity<Doctor> updateEmployee(@PathVariable Long id, @RequestBody Doctor employeeDetails){
//		Doctor employee = employeeRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
//
//		employee.setFirstName(employeeDetails.getFirstName());
//		employee.setLastName(employeeDetails.getLastName());
//		employee.setEmailId(employeeDetails.getEmailId());
//
//		Doctor updatedEmployee = employeeRepository.save(employee);
//		return ResponseEntity.ok(updatedEmployee);
//	}

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
