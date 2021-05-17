package com.shardul.realtimeprojectjpacrudwithnativeapi.dao;

import java.util.List;

import com.shardul.realtimeprojectjpacrudwithnativeapi.entity.Rating;

public interface Ratingdao {
    public List<Rating> findAll();

    public Rating findById(int theId);


    public void save(Rating theRating);

    public void deleteById(int theId);

    
    
}
