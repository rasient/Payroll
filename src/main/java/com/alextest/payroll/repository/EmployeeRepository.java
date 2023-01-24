package com.alextest.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alextest.payroll.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
