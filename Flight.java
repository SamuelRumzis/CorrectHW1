package org.depaul.se350.classdesignexample;

import org.depaul.se350.classdesignexample.exception.BadParameterException;
import org.depaul.se350.classdesignexample.exception.NullParameterException;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.Random;

public class Flight {
//    public enum ProductType {
//        PRINT, FOOD, HEALTH, GENERAL
//    }

    private String flightTime;
    private String startDest;
    private String endDest;
    private String flightName;
    private boolean delayed;

    public Flight(String flightTime, String startDest, String endDest, boolean delayed)
            throws NullParameterException, BadParameterException {
        this.flightTime = flightTime;
        this.startDest = startDest;
        this.endDest = endDest;
        this.delayed = delayed;
    }

    public String randomFlightNum(){
        int leftLimit = 48; // 0
        int rightLimit = 122; // Z
        int length = 4;
        Random random = new Random();
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }
    // Get functions for basic variables
    public String getFlightTime() {
        return flightTime;
    }

    public String getStartDest() {
        return startDest;
    }

    public String getEndDest() {
        return endDest;
    }

    public boolean getDelayed() {
        return delayed;
    }

    public String toString() {
        return "Flight: " + flightTime + "\n" + "Start Destination: " + startDest + "\n" + "End Destination: " + endDest + "\n" + "Delayed: " + delayed + "\n" + "Flight Name: " + randomFlightNum();
    }

    public boolean equals(Object obj) {
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        final Flight other = (Flight) obj;
        if (!flightTime.equals(other.flightTime)) {
            return false;
        }
        if (startDest != other.startDest) {
            return false;
        }
        if (endDest != other.endDest) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
       return Objects.hash(flightTime, startDest, endDest, delayed);
    }
}
