package com.shardul.realtimeprojectjpacrudwithnativeapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_info")
public class Employee {
    //define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employeeid")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String emailId;



	public Employee() {
		
	}

    //define constructors
    public Employee(String firstName,String lastName,String email){
        
        this.firstName =firstName;
        this.lastName =lastName;
        this.emailId=email;
    }



    //define getter/setter
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


    //define tostring
    @Override
    public String toString() {
        return "Employee [emailId=" + emailId + ", firstName=" + firstName + ", id=" + id + ", lastName=" + lastName
                + "]";
    }




}
