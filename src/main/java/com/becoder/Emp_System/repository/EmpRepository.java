package com.becoder.Emp_System.repository;

import com.becoder.Emp_System.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}