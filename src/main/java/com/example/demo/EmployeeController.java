package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	@PostMapping(value = "/postEmps")
	public String post(@RequestBody Employee emp) {
		return es.post(emp);
		
	}
	
	
	@PostMapping(value="/postEmpss")
	public String post1(@RequestBody List<Employee> emps) {
		return es.post1(emps);
		
	}
	
	@GetMapping(value="/getEmpById/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return es.getEmployee(id);
	}
	
	@GetMapping(value="/getEmpByI") 
	public List<Employee> getEmployee1() {
		return es.getEmployee1();
	}
	
	@DeleteMapping(value="/deleteById/{id}")
		public String deleteEmp(@PathVariable int id) {
			return es.deleteEmp(id);
		}
	@DeleteMapping(value="/deleteByAll")
	public void deleteEmp() {
		es.deleteEmp();
	}
	
	@PutMapping(value="/putEmployee")
	public String put(@RequestBody Employee emp1) {
		return es.put(emp1);
	}
	
	@PatchMapping(value="/patchEmployee/{id}") 
	public String patch(@PathVariable int id, @RequestBody Employee emp2) {
		return es.patch(id,emp2);
	}
	@PutMapping(value="/putEmployee/{id}")
	public String put1(@RequestBody Employee emp3) {
		return es.put1(emp3);
	}
}
