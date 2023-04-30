package com.employee.tracker.employer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.employee.tracker.employee.Employee;
import com.employee.tracker.employee.EmployeeRepository;

@Component
public class permanentEmployees implements CommandLineRunner{
	
	
    private final EmployeeRepository empRepo;
    
	public permanentEmployees(EmployeeRepository empRepo) {
		super();
		this.empRepo = empRepo;
	}

	@Override
	public void run(String... args) throws Exception {
	
		Employee emp1 = new Employee();
		emp1.setName("Sudharshan");
		emp1.setEmail("sudha@gmail.com");
		emp1.setEmployeeID("46167995");
	     
	
	    Employee empl = empRepo.save(emp1);
	}

}
