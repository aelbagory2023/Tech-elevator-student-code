package com.techelevator.movies.dao;

import com.techelevator.movies.model.Genre;
import com.techelevator.movies.model.Person;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcPersonDao implements PersonDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcPersonDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Person> getPersons() {
        List<Person> person = new ArrayList<Person>();
        String sql = "SELECT person_id, person_name, birthday, deathday, biography, profile_path, home_page FROM person;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()) {
            person.add(mapRowToPerson(results));
        }
        return person;
    }

    @Override
    public Person getPersonById(int id) {
        Person person = null;
        String sql = "SELECT person_id, person_name, birthday, deathday, biography, profile_path, home_page FROM person WHERE person_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
        if(results.next()){
            person = (mapRowToPerson(results));
        }
        return person;
    }

    @Override
    public List<Person> getPersonsByName(String name, boolean useWildCard) {
        List<Person> person = new ArrayList<Person>();
        String sql = "SELECT person_id, person_name, birthday, deathday, biography, profile_path, home_page FROM person WHERE person_name = ?;";

        String wildCardName = name;
        if(useWildCard){
            wildCardName = "%" + name + "%";
            sql = "SELECT person_id, person_name, birthday, deathday, biography, profile_path, home_page FROM person WHERE person_name ILIKE ?;";
        }
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, wildCardName);
        while(results.next()) {
            person.add(mapRowToPerson(results));
        }
        return person;
    }

    @Override
    public List<Person> getPersonsByCollectionName(String collectionName, boolean useWildCard) {
        String sql = "SELECT ";
        return null;
    }
    private Person mapRowToPerson(SqlRowSet rowSet) {
        Person person = new Person();
        person.setId(rowSet.getInt("person_id"));
        person.setName(rowSet.getString("person_name"));
        person.setBirthday(rowSet.getDate("birthday").toLocalDate());
        person.setDeathDate(rowSet.getDate("deathday").toLocalDate());
        person.setBiography(rowSet.getString("biography"));
        person.setProfilePath(rowSet.getString("profile_path"));
        person.setHomePage(rowSet.getString("home_page"));
        return person;
    }
}
