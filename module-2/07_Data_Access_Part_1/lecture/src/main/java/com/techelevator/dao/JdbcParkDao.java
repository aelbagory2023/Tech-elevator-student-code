package com.techelevator.dao;

import com.techelevator.model.Park;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JdbcParkDao implements ParkDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcParkDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int getParkCount() {

        return 0;

    }
    
    @Override
    public LocalDate getOldestParkDate() {
        LocalDate oldestParkDate = null;
        String sql = "SELECT MIN(date_established) AS oldest_date FROM park;";
       SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
       if(results.next()) {
           oldestParkDate = results.getDate("oldest_date").toLocalDate();
       }





        return oldestParkDate;



    }
    
    @Override
    public double getAverageParkArea() {
        double averageArea = 0.0;
        String sql = "SELECT AVG(area) AS average_area FROM park;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        if(results.next()) {
            averageArea = results.getDouble("average_area");
        }
        return averageArea;
    }
    
    @Override
    public List<String> getParkNames() {
        List<String> parkNames = new ArrayList<String>();
        String sql = "SELECT park_name FROM park;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()) {   //read the results line by line while there are results to read
            String name = results.getString("park_name"); //turn the sql data into a java datatype
            parkNames.add(name);
        }
        return parkNames;
    }
    
    @Override
    public Park getRandomPark() {
        Park randomPark = new Park();
        String sql = "SELECT * FROM park ORDER BY RANDOM() LIMIT 1;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        if(results.next()) {
            randomPark = mapRowToPark(results);
        }
        return randomPark;
    }

    @Override
    public List<Park> getParksWithCamping() {
        return new ArrayList<>();
    }

    @Override
    public Park getParkById(int parkId) {
        Park parkById = new Park();
        String sql = "SELECT * FROM park WHERE park_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        if(results.next()) {
            parkById = mapRowToPark(results);
        }return parkById();
    }

    @Override
    public List<Park> getParksByState(String stateAbbreviation) {
        return new ArrayList<>();
    }

    @Override
    public List<Park> getParksByName(String name, boolean useWildCard) { return new ArrayList<>(); }

    private Park mapRowToPark(SqlRowSet sqldata) {
        Park javapark = new Park();
        javapark.setParkId(sqldata.getInt("park_id"));
        javapark.setParkName(sqldata.getString("park_name"));
        javapark.setDateEstablished(sqldata.getDate("date_established").toLocalDate());
        javapark.setArea(sqldata.getDouble("area"));
        javapark.setHasCamping(sqldata.getBoolean("has_camping"));
        return new Park();
    }
}
