package com.techelevator.movies.dao;

import com.techelevator.movies.model.Collection;
import com.techelevator.movies.model.Genre;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcGenreDao implements GenreDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcGenreDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Genre> getGenres() {
        List<Genre> genre = new ArrayList<Genre>();
        String sql = "SELECT genre_id, genre_name FROM genre;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()) {
            genre.add(mapRowToGenre(results));
        }



        return genre;
    }

    @Override
    public Genre getGenreById(int id) {
        Genre genre = null;
        String sql = "SELECT genre_id, genre_name FROM genre WHERE genre_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
        if(results.next()) {
            genre = mapRowToGenre(results);
        }



        return genre;
    }

    @Override
    public List<Genre> getGenresByName(String name, boolean useWildCard) {
       List<Genre> genre = new ArrayList<Genre>();
        String sql = "SELECT genre_id, genre_name FROM genre WHERE genre_name = ?;";
        String wildCardName = name;
        if(useWildCard) {
            wildCardName = "%" + name + "%";
            sql = "SELECT genre_id, genre_name FROM genre WHERE genre_name ILIKE ?;";
        }
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, wildCardName);
        while(results.next()) {
            genre.add(mapRowToGenre(results));
        }



        return genre;
    }

    private Genre mapRowToGenre(SqlRowSet rowSet) {
        Genre genre = new Genre();
        genre.setId(rowSet.getInt("genre_id"));
        genre.setName(rowSet.getString("genre_name"));
        return genre;

    }
}
