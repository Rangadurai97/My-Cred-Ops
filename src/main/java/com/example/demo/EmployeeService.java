package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDAO ed;
	
	public String post(Employee emp) {
		return ed.post(emp);
	}
	
	
	public String post1(List<Employee> emps) {
		return ed.post1(emps);
	}
	
	
	public Employee getEmployee(int id) {
		return ed.getEmployee(id);
	}
	
	public List<Employee> getEmployee1() {
		return ed.getEmployee1();
	}
	
	public String deleteEmp(int id) {
		return ed.deleteEmp(id);
	}
	
	public void deleteEmp() {
		ed.deleteEmp();
	}
	
	public String put(Employee emp1) {
		return ed.put(emp1);
	}
	public String patch(int id, Employee emp2) {
		return ed.patch(id,emp2);
	}
	public String put1(Employee emp3) {
		return ed.put1(emp3);
	}
}
