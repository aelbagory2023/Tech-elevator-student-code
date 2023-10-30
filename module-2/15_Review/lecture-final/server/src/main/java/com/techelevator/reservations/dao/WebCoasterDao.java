package com.techelevator.reservations.dao;

import com.techelevator.reservations.model.Coaster;
import com.techelevator.reservations.services.CoasterService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WebCoasterDao implements CoasterDao {

    private CoasterService coasterService;

    public WebCoasterDao() {
        this.coasterService = new CoasterService();
    }


    @Override
    public List<Coaster> getCoasters() {
        return coasterService.listCoasters();
    }

    @Override
    public Coaster getCoasterById(int id) {
        List<Coaster> coasters = getCoasters();
        for (Coaster coaster : coasters) {
            if (coaster.getId() == id) {
                return coaster;
            }
        }

        return null;
    }

    @Override
    public List<Coaster> getCoastersByState(String state) {
        return coasterService.listCoastersByState(state);
    }
}
