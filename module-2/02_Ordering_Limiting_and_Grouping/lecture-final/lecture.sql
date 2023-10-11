-- ORDERING RESULTS

-- Populations of all states from largest to smallest.


-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.


-- The biggest park by area
SELECT * FROM park ORDER BY area DESC; 


-- LIMITING RESULTS

-- The 10 largest cities by populations
SELECT * FROM city ORDER BY population DESC LIMIT 10;


-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.
SELECT park_name, (CURRENT_DATE - date_established) / 365 AS age_in_years
FROM park 
ORDER BY age_in_years DESC, park_name ASC 
LIMIT 20; 



-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.
SELECT (city_name || ', ' || state_abbreviation) AS city_state FROM city; 

-- The all parks by name and date established.
SELECT (park_name || ' was established on: ' || date_established) AS name_and_date_established FROM park; 

-- The census region and state name of all states in the West & Midwest sorted in ascending order.
SELECT (state_name || ' is in the ' || census_region) AS state_region FROM state WHERE census_region ILIKE '%west' ORDER BY state_region;


-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT AVG(population) AS average_state_population FROM state; 

-- Total population in the West and South census regions
SELECT SUM(population) AS total_population FROM state WHERE census_region IN ('West', 'South');


-- The number of cities with populations greater than 1 million
SELECT COUNT(state_abbreviation) AS big_cities FROM city WHERE population > 1000000;
--COUNT() counts the number of rows that are returned by the query, it does not add up the values in those rows 

-- The number of state nicknames.
SELECT COUNT(state_nickname) AS nickname_count FROM state;


-- The area of the smallest and largest parks.
SELECT MIN(area) AS smallest_area, MAX(area) AS largest_area FROM park;


-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT COUNT(city_name) AS city_count, state_abbreviation FROM city GROUP BY state_abbreviation ORDER BY city_count DESC; 

-- Determine the average park area depending upon whether parks allow camping or not.
SELECT AVG(area) AS average_area, has_camping FROM park GROUP BY has_camping; 

-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT SUM(population) AS total_population, state_abbreviation FROM city GROUP BY state_abbreviation ORDER BY state_abbreviation; 

-- The smallest city population in each state ordered by city population.
SELECT MIN(population) AS smallest_city, state_abbreviation
FROM city 
GROUP BY state_abbreviation; 

--a chatGPT subquery to get the city name as well (but it doesn't use a GROUP BY)
SELECT c.state_abbreviation, c.city_name, c.population
FROM city c
WHERE c.population = (
    SELECT MIN(population)
    FROM city
    WHERE state_abbreviation = c.state_abbreviation
)
ORDER BY c.state_abbreviation;

-- Miscelleneous

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET and FETCH if you want to get
-- "pages" of results.
-- For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)
SELECT city_name, population
FROM city
ORDER BY city_name
OFFSET 20 ROWS FETCH NEXT 10 ROWS ONLY;


-- SUBQUERIES (optional)

-- Include state name rather than the state abbreviation while counting the number of cities in each state,


-- Include the names of the smallest and largest parks
SELECT MIN(area) AS smallest_area, MAX(area) AS largest_area FROM park;

SELECT park_name, area 
FROM park p, 
	(SELECT MIN(area) AS smallest_area, MAX(area) AS largest_area FROM park) AS smallest_largest
WHERE p.area = smallest_largest.smallest_area OR p.area = smallest_largest.largest_area;



-- List the capital cities for the states in the Northeast census region.

