package com.employee.tracker.employee;

import java.util.List;

public interface EmployeeServices {
	
	
	    List<Employee> getAllEmployee();
	    void save(Employee employee);
	    Employee getById(int id);
	    void deleteViaId(int id);
	}

