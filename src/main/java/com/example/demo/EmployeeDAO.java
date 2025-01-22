package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository er;
	
	public String post(Employee emp) {
		er.save(emp);
		return "Posted Successfully";
	}
	
	
	public String post1(List<Employee> emps) {
		er.saveAll(emps);
		return "Posted Very Successfully";
	}
	
	
	public Employee getEmployee(int id) {
		return er.findById(id).get();
	}
	
	
	public List<Employee> getEmployee1() {
		return er.findAll();
	}
	
	public String deleteEmp(int id) {
		er.deleteById(id);
		return "Deleted Successfully";
	}
	
	public void deleteEmp() {
		er.deleteAll();
		System.out.println( "Deleted Successfully");
	}
	
	public String put(Employee emp1) {
		er.save(emp1);
		return "Updated"; 
	}
	public String patch(int id, Employee emp2) {
		Employee e1 = er.findById(id).get();
		e1.setSalary(emp2.getSalary());
		er.save(e1);
		return "Salary Patched";
	}
	public String put1(Employee emp3) {
		er.save(emp3);
		return "Yes Updated";
	}
	
	
}