package com.employee.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee.tracker.employee.Employee;
import com.employee.tracker.employee.EmployeeRepository;
import com.employee.tracker.employee.EmployeeServiceImpl;

@Controller
public class Manager {
	  @Autowired
	    private EmployeeServiceImpl employeeServiceImpl;
	 
	    @GetMapping("/")
	    public String viewHomePage(Model model) {
	        model.addAttribute("allemplist", employeeServiceImpl.getAllEmployee());
	        return "index";
	    }
	 
	    @GetMapping("/addnew")
	    public String addNewEmployee(Model model) {
	        Employee employee = new Employee();
	        model.addAttribute("employee", employee);
	        return "newemployee";
	    }
	 
	    @PostMapping("/save")	
	    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
	        employeeServiceImpl.save(employee);
	        return "redirect:/";
	    }
	 
	    @GetMapping("/Update/{id}")
	    public String updateForm(@PathVariable(value = "id") int id, Model model) {
	        Employee employee = employeeServiceImpl.getById(id);
	        model.addAttribute("employee", employee);
	        return "update";
	    }
	 
	    @GetMapping("/deleteEmployee/{id}")
	    public String deleteThroughId(@PathVariable(value = "id") int id) {
	        employeeServiceImpl.deleteViaId(id);
	        return "redirect:/";
	 
	    }
}
