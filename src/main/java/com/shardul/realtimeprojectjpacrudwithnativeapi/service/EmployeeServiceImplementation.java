package com.shardul.realtimeprojectjpacrudwithnativeapi.service;

import java.util.List;

import com.shardul.realtimeprojectjpacrudwithnativeapi.dao.Employeedao;
import com.shardul.realtimeprojectjpacrudwithnativeapi.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

    private Employeedao employeedao;

    @Autowired
    public EmployeeServiceImplementation(@Qualifier("employeeDAOJPAImplementation") Employeedao theEmployeedao)
    {
        employeedao = theEmployeedao;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeedao.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int theId) {
        
        return employeedao.findById(theId);
    }

    @Override
    @Transactional
    public void save(Employee theEmployee) {
        employeedao.save(theEmployee);

    }

    @Override
    public void deleteById(int theId) {
        employeedao.deleteById(theId);
    }

     
    
}
