package com.project.service.implementation;

import java.util.List;

import javax.ejb.Stateless;

import org.hibernate.Session;

import com.project.config.HibernateConfiguration;
import com.project.entities.Employee;
import com.project.service.IEmployeService;

@Stateless
public class EmployeeServiceImpl implements IEmployeService {
	
	private Session session = HibernateConfiguration.getSession();

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		 return this.session.createQuery("select e from Employee e",Employee.class).getResultList();
	}

	@Override
	public boolean saveEmployee(Employee Employee) {
		// TODO Auto-generated method stub
		try {
            this.session.beginTransaction();
            this.session.save(Employee);
            this.session.getTransaction().commit();
            return true;
        } catch (Exception ex){
            this.session.getTransaction().rollback();
            ex.printStackTrace();
            return false;
        }
	}

	@Override
	public boolean updateEmployee(Employee Employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee getEmployeeByTel(String telephone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeByEmail(String Email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
