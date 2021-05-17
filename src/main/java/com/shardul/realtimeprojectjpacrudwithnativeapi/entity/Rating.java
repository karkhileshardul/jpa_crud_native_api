package com.shardul.realtimeprojectjpacrudwithnativeapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rating")
public class Rating {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ratingid")
    int ratingId;

    @Column(name="employeeid")
    int employeeId;

    @Column(name="description")
    String description;


    Rating(){

    }

    Rating(int theRatingId,int theEmployeeId,String theDescription)
    {
        this.ratingId=theRatingId;
        this.employeeId=theEmployeeId;
        this.description=theDescription;
    }
    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

}
