package com.techelevator.reservations.services;

import com.techelevator.reservations.exception.DaoException;
import com.techelevator.reservations.model.Coaster;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class CoasterService {

    private static final String API_BASE_URL = "http://localhost:3000";
    private final RestTemplate restTemplate = new RestTemplate();

    /**
     * List all coasters in the system
     */
    public List<Coaster> listCoasters() {
        List<Coaster> coasters = new ArrayList<>();
        Coaster[] returnedCoasters;
        try {
            returnedCoasters = restTemplate.getForObject(API_BASE_URL + "/coasters?country=United+States", Coaster[].class);
            for (Coaster coaster : returnedCoasters) {
                coasters.add(coaster);
            }
        } catch (RestClientResponseException e) {
            // handles exceptions thrown by rest template and contains status codes
            throw new DaoException(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            // i/o error, ex: the server isn't running
            throw new DaoException(e.getMessage());
        }
        return coasters;
    }

    /**
     * List all coasters in the system
     */
    public List<Coaster> listCoastersByState(String state) {
        List<Coaster> coasters = new ArrayList<>();
        Coaster[] returnedCoasters;
        try {
            returnedCoasters = restTemplate.getForObject(API_BASE_URL + "/coasters?country=United+States&state=" + state, Coaster[].class);
            for (Coaster coaster : returnedCoasters) {
                coasters.add(coaster);
            }
        } catch (RestClientResponseException e) {
            // handles exceptions thrown by rest template and contains status codes
            throw new DaoException(e.getRawStatusCode() + " : " + e.getStatusText());
        } catch (ResourceAccessException e) {
            // i/o error, ex: the server isn't running
            throw new DaoException(e.getMessage());
        }
        return coasters;
    }

}
