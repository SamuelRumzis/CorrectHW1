package org.depaul.se350.classdesignexample;

import org.depaul.se350.classdesignexample.exception.BadParameterException;
import org.depaul.se350.classdesignexample.exception.NullParameterException;

import java.util.Objects;

public class Airline {
//    public enum ProductType {
//        PRINT, FOOD, HEALTH, GENERAL
//    }

    private String airlineName;
    private double seatCost;
    private boolean checkInLuggage;

    public Airline(String airportName, double seatCost, boolean checkInLuggage)
            throws NullParameterException, BadParameterException {
        this.airlineName = airportName;
        this.seatCost = seatCost;
        this.checkInLuggage = checkInLuggage;
    }

    // Get functions for 3 basic variables
    public String getAirlineName() {
        return airlineName;
    }

    public double getCity() {
        return seatCost;
    }

    public boolean getCountry() {
        return checkInLuggage;
    }


    public String toString() {
        return "Airline: " + airlineName + "\n" + "Seat Cost: " + seatCost + "\n" + "Check In Luggage: " + checkInLuggage;
    }



    public boolean equals(Object obj) {
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        final Airline other = (Airline) obj;
        if (!getAirlineName().equals(other.getAirlineName())) {
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
       return Objects.hash(airlineName, seatCost, checkInLuggage);
    }
}
