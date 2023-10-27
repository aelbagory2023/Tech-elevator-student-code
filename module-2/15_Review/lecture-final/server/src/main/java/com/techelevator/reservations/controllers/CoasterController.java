package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.CoasterDao;
import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.exception.DaoException;
import com.techelevator.reservations.model.Coaster;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.State;
import com.techelevator.reservations.dao.StateDao;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CoasterController {

    private StateDao stateDao;
    private CoasterDao coasterDao;

    public CoasterController(StateDao stateDao, CoasterDao coasterDao) {
        this.stateDao = stateDao;
        this.coasterDao = coasterDao;
    }

    @RequestMapping(path = "/states", method = RequestMethod.GET)
    public List<State> getStates() {
        return stateDao.getStates();
    }

    @RequestMapping(path = "/coasters", method = RequestMethod.GET)
    public List<Coaster> getCoasters(@RequestParam(required = false, defaultValue = "", name = "state") String abbrev) {
        if (abbrev == null || abbrev.equals("")) {
            return coasterDao.getCoasters();
        }
        else {
            return getCoastersByState(abbrev);
        }
    }

    @RequestMapping(path = "/coasters/{id}", method = RequestMethod.GET)
    public Coaster getCoasterById(@PathVariable int id) {
        return coasterDao.getCoasterById(id);
    }

    @RequestMapping(path = "/states/{abbrev}/coasters", method = RequestMethod.GET)
    public List<Coaster> getCoastersByState(@PathVariable String abbrev) {
        State state = stateDao.getStateByAbbreviation(abbrev);
        if (state == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid state abbreviation.");
        }

        String stateName = state.getStateName();
        // TODO If we need to, replace spaces with plus signs

        return coasterDao.getCoastersByState(stateName);
    }

}
