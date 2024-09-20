package com.becoder.Emp_System.service;

import com.becoder.Emp_System.entity.Employee;

import java.util.List;

public interface EmpService {


    public Employee saveEmp(Employee emp);

    public List<Employee> getAllEmp();

    public Employee getEmpById(int id);

    public boolean deleteEmp(int id);
}
