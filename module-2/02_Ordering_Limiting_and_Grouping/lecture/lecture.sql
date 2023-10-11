-- ORDERING RESULTS

-- Populations of all states from largest to smallest.


-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.


-- The biggest park by area
SELECT * FROM park order by area DESC LIMIT 1;


-- LIMITING RESULTS

-- The 10 largest cities by populations
SELECT * FROM city ORDER BY population DESC LIMIT 10;

-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.

SELECt park_name, (CURRENT_DATE - date_established)/ 365 AS age_in_years 
FROM park 
ORDER BY age_in_years DESC, park_name ASC
LIMIT 20;


-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.
SELECT city_name|| ', ' ||state_abbreviation AS city_state from city;

-- The all parks by name and date established.
SELECT park_name|| ' was established on: ' ||date_established AS name_and_date FROM park;

-- The census region and state name of all states in the West & Midwest sorted in ascending order.
SELECT state_name || ' Is in the ' ||census_region AS state_and_census 
FROM state WHERE census_region IN ('West','Midwest')
ORDER By state_and_census ASC;


-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT AVG(population) AS average_state_population FROM state;
-- Total population in the West and South census regions

SELECT SUM(population) AS total_population_west_and_south FROM state WHERE census_region IN ('West', 'South');
-- The number of cities with populations greater than 1 million
SELECT COUNT(city_name) AS big_cities FROM city WHERE population > 1000000;

-- The number of state nicknames.
SELECT COUNT(state_nickname) AS number_of_nicknames FROM state;

-- The area of the smallest and largest parks.
SELECT MIN(area) AS smallest_park, MAX(area) AS largest_park From park;


-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT count(city_name) AS city_count, state_abbreviation FROM city GROUP BY state_abbreviation ORDER BY city_count DESC;

-- Determine the average park area depending upon whether parks allow camping or not.
SELECT AVG(area) AS average_park_area, has_camping FROM park GROUP by has_camping;

-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT SUM(population) AS total_population_of_state, state_abbreviation FROM city GROUP BY state_abbreviation ORDER BY state_abbreviation;

-- The smallest city population in each state ordered by city population.

SELECT min(population) AS smallest_city, state_abbreviation FROM city GROUP BY state_abbreviation;

-- Miscelleneous

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET and FETCH if you want to get
-- "pages" of results.
-- For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)



-- SUBQUERIES (optional)

-- Include state name rather than the state abbreviation while counting the number of cities in each state,


-- Include the names of the smallest and largest parks
SELECT MIN(area) AS smallest_park, MAX(area) AS largest_park From park;

SELECT park_name, area FROM park p, (
    SELECT MIN(area) AS smallest_park, MAX(area) AS largest_park From park
) AS smallest_largest
WHERE p.area = smallest_largest.smallest_area or p.area = smallest_largest.largest_area;


-- List the capital cities for the states in the Northeast census region.

