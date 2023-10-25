package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Address;
import com.techelevator.reservations.model.Animal;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class HotelController {

    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public HotelController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDao.getHotels();
    }

    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservations(@RequestParam(required=false, defaultValue = "0") int hotelId,@RequestParam(required=false, defaultValue = "0") int guests) {
        List<Reservation> reservations;
        List<Reservation> filteredReservations = new ArrayList<>();
        if (hotelId > 0) {
            reservations = reservationDao.getReservationsByHotel(hotelId);
        }
        else {
            reservations = reservationDao.getReservations();
        }

        for (Reservation reservation : reservations) {
            if (guests == 0 || reservation.getGuests() == guests) {
                filteredReservations.add(reservation);
            }
        }

        return filteredReservations;

    }

    @RequestMapping(path = "/addresses", method = RequestMethod.GET)
    public List<Address> listAddresses() {
        List<Address> addresses = new ArrayList<>();
        List<Hotel> hotels = hotelDao.getHotels();
        for (Hotel hotel : hotels) {
            addresses.add(hotel.getAddress());
        }

        return addresses;
    }

    @RequestMapping(path = "/hotels/zipcodes", method = RequestMethod.GET)
    public Set<String> listZipcodes() {
        Set<String> zipcodes = new HashSet<>();
        List<Hotel> hotels = hotelDao.getHotels();
        for (Hotel hotel : hotels) {
            zipcodes.add(hotel.getAddress().getZip());
        }

        return zipcodes;
    }

    @RequestMapping(path = "/animals", method = RequestMethod.GET)
    public List<Animal> listAnimals() {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Cow", "moo"));
        animals.add(new Animal("Chicken", "cluck"));

        return animals;
    }

    @RequestMapping(path = "/farm", method = RequestMethod.GET)
    public String listAnimalsOnTheFarm() {
        String lines = "";
        List<Animal> animals = listAnimals();

        for (Animal animal : animals) {
            lines += "OLd MacDonald had a farm, eieio<br />";
            lines += "And on that farm, he had a " + animal.getName()+"<br/>";
            lines += "which said "+ animal.getSound()+"<br />";
        }

        return lines;
    }


    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDao.getHotelById(id);
    }

    @RequestMapping(path = "/reservations/{id}", method = RequestMethod.GET)
    public Reservation getReservationById(@PathVariable int id) {
        return reservationDao.getReservationById(id);
    }

    @RequestMapping(path = "/hotels/{hotelId}/reservations", method = RequestMethod.GET)
    public List<Reservation> getReservationByHotelId(@PathVariable int hotelId) {
        return reservationDao.getReservationsByHotel(hotelId);
    }

    @RequestMapping(path = "/animals/{species}", method = RequestMethod.GET)
    public Animal getAnimalByName(@PathVariable String species) {
        List<Animal> animals = listAnimals();
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(species)) {
                return animal;
            }
        }

        return null;
    }

    @RequestMapping(path = "/reservations", method = RequestMethod.POST)
    public Reservation addReservation(@RequestBody Reservation newReservation) {
        Reservation returnedReservation = reservationDao.createReservation(newReservation);
        return returnedReservation;
    }



}
