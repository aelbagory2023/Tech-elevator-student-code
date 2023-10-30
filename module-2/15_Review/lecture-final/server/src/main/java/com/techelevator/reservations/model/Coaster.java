package com.techelevator.reservations.model;

public class Coaster {
    private int id;
    private String name;
    private Park park;
    private String city;
    private String state;

    public Coaster() {

    }

    public Coaster(int id, String name, Park park, String city, String state) {
        this.id = id;
        this.name = name;
        this.park = park;
        this.city = city;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Park getPark() {
        return park;
    }

    public void setPark(Park park) {
        this.park = park;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
