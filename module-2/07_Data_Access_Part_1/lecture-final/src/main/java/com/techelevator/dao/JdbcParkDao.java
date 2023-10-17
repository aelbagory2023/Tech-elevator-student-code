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
        int numberOfParks = 0;
        String sql = "SELECT COUNT(*) AS park_count FROM park;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql); //.queryForRowSet() returns a SqlRowSet object
        if(results.next())  //read the results, and if there is something there, read it in
        {
            numberOfParks = results.getInt("park_count"); //use the column name (in this case, our label "park_count" to get the value and convert it to a Java type
        }
        return numberOfParks;
    }
    
    @Override
    public LocalDate getOldestParkDate() {
        LocalDate oldestParkDate = null;
        String sql = "SELECT MIN(date_established) AS oldest_date FROM park;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        if(results.next()) //read the results with .next() and if there is something there, we'll use it
        {
            oldestParkDate = results.getDate("oldest_date").toLocalDate();
        }
        return oldestParkDate;
    }
    
    @Override
    public double getAverageParkArea() {
        double averageArea = 0.0;
        String sql = "SELECT AVG(area) AS average_area FROM park;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        if(results.next())
        {
            averageArea = results.getDouble("average_area");
        }
        return averageArea;
    }
    
    @Override
    public List<String> getParkNames() {
        List<String> parkNames = new ArrayList<String>();
        String sql = "SELECT park_name FROM park;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()) //read the results line by line WHILE there are lines to read
        {
            String name = results.getString("park_name"); //turn the SQL data into a Java data type
            parkNames.add(name); //add the park name to the list
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
        String sql = "SELECT * FROM park WHERE park_id = ?;"; //use a question mark as a placeholder for another value
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, parkId); //pass in the sql string, and what to place in the string at the question mark
        if(results.next()) {
            parkById = mapRowToPark(results);
        }
        return parkById;
    }

    @Override
    public List<Park> getParksByState(String stateAbbreviation) {
        List<Park> parks = new ArrayList<Park>();
        String sql = "SELECT park.park_id, park_name, date_established, area, has_camping " +
                "FROM park " +
                "JOIN park_state ON park.park_id = park_state.park_id " +
                "WHERE state_abbreviation = ?;"; //use a question mark as a placeholder for another value
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, stateAbbreviation); //pass in the sql string, and what to place in the string at the question mark
        while(results.next()) {
            Park nextPark = mapRowToPark(results);
            parks.add(nextPark);
        }
        return parks;
    }

    @Override
    public List<Park> getParksByName(String name, boolean useWildCard) { return new ArrayList<>(); }

    private Park mapRowToPark(SqlRowSet sqlData) {
        Park javaPark = new Park();
        javaPark.setParkId(sqlData.getInt("park_id"));
        javaPark.setParkName(sqlData.getString("park_name"));
        javaPark.setDateEstablished(sqlData.getDate("date_established").toLocalDate());
        javaPark.setArea(sqlData.getDouble("area"));
        javaPark.setHasCamping(sqlData.getBoolean("has_camping"));
        return javaPark;
    }
}
