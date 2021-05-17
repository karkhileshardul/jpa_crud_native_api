package com.shardul.realtimeprojectjpacrudwithnativeapi.dao;

import java.util.List;

import com.shardul.realtimeprojectjpacrudwithnativeapi.entity.Employee;

public interface Employeedao {
    

    public List<Employee> findAll();
    public Employee findById(int theId);
    public void save(Employee theEmployee);

    public void deleteById(int theId);
    
}
