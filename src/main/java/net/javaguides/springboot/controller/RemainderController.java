package net.javaguides.springboot.controller;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Remainder;
import net.javaguides.springboot.repository.RemainderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class RemainderController {

    @Autowired
    private RemainderRepository remainderRepository;

    // get all employees
//	@GetMapping("/employees")
//	public List<Doctor> getAllEmployees(){
//		return employeeRepository.findAll();
//	}

    // create employee rest api
    @PostMapping("/remainder")
    public Remainder addRemainder(@RequestBody Remainder remainder) {
        return remainderRepository.save(remainder);
    }




    @GetMapping("/remainder")
    public List<Remainder> getAllProducts(){
        return remainderRepository.findAll();
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

    @DeleteMapping("/remainder/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteRemainder(@PathVariable Long id){
        Remainder remainder = remainderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));

        remainderRepository.delete(remainder);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }


}
