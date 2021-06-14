package com.project.service;

import java.util.List;

import javax.ejb.Local;

import com.project.entities.Employee; 

@Local
public interface IEmployeService {
	List<Employee> getAllEmployees();


    boolean saveEmployee(Employee Employee);

    boolean updateEmployee(Employee Employee);

    Employee getEmployeeByTel(String telephone);

    Employee getEmployeeByEmail(String Email);

    Employee getEmployeeById(Long id);

}
