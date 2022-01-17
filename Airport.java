package org.depaul.se350.classdesignexample;

import org.depaul.se350.classdesignexample.exception.BadParameterException;
import org.depaul.se350.classdesignexample.exception.NullParameterException;

import java.util.Objects;

public class Airport {
//    public enum ProductType {
//        PRINT, FOOD, HEALTH, GENERAL
//    }

    private String airportName;
    private String city;
    private String country;

    public Airport(String airportName, String city, String country)
            throws NullParameterException, BadParameterException {
        this.airportName = airportName;
        this.city = city;
        this.country = country;
    }

    // Get functions for 3 basic variables
    public String getAirportName() {
        return airportName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return airportName;
    }


    public String toString() {
        return "Airport: " + airportName + "\n" + "City: " + city + "\n" + "Country: " + country;
    }



    public boolean equals(Object obj) {
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        final Airport other = (Airport) obj;
        if (!getAirportName().equals(other.getAirportName())) {
            return false;
        }
        if (getCity() != other.getCity()) {
            return false;
        }
        if (getCountry() != other.getCountry()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
       return Objects.hash(airportName, city, country);
    }
}
