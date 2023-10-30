package com.wiley.employee_management.Employee_Management.Controllers;


import com.wiley.employee_management.Employee_Management.Models.Employee;
import com.wiley.employee_management.Employee_Management.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthController {

    @Autowired
    EmployeeRepo employeeRepo;

    @PostMapping("/registerUser")
    public String register(@RequestBody Employee emp) {
        List<Employee> allUsers = employeeRepo.findAll();

        for (Employee u : allUsers) {
            if (u.getEmpName().equals(emp.getEmpName()) && u.getDesignation().equals(emp.getDesignation())) {
                return "User Already Registered";
            }
        }

        employeeRepo.save(emp);
        return "User Registered";
    }

    @PostMapping("/login")
    public String Login(@RequestBody Employee emp)
    {
        List<Employee> allUsers = employeeRepo.findAll();

        for (Employee u : allUsers) {
            if (u.getEmpName().equals(emp.getEmpName()) && u.getDesignation().equals(emp.getDesignation())) {
                return "Successfully Logged In";
            }
        }

        return "User Not Found";
    }

}
