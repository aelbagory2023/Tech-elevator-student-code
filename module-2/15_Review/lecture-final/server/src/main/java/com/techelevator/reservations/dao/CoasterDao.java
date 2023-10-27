package com.techelevator.reservations.dao;

import com.techelevator.reservations.model.Coaster;

import java.util.List;

public interface CoasterDao {
    public List<Coaster> getCoasters();

    public List<Coaster> getCoastersByState(String state);

    public Coaster getCoasterById(int id);

}
