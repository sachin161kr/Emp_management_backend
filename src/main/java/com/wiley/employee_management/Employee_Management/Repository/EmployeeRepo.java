package com.wiley.employee_management.Employee_Management.Repository;

import com.wiley.employee_management.Employee_Management.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {



}
