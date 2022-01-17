
import org.depaul.se350.classdesignexample.Airport;
import org.depaul.se350.classdesignexample.Airline;
import org.depaul.se350.classdesignexample.Flight;
import org.depaul.se350.classdesignexample.exception.BadParameterException;
import org.depaul.se350.classdesignexample.exception.NullParameterException;

public class Main {
    public static void main(String[] args) throws BadParameterException, NullParameterException
    {
        Airport Airport2 = new Airport("Airport A", "Chicago", "USA");
        Airport Airport3 = new Airport("Airport A", "Chicago", "USA");

        System.out.println(Airport2);
        System.out.println(String.format("Are the two Airports equal: %s", Airport2.equals(Airport3)));
        System.out.println("-----------------------------------------");

        Airline Airline2 = new Airline("United", 75.75, true);
        Airline Airline3 = new Airline("American", 67.80, true);

        System.out.println(Airline2);
        System.out.println(String.format("Are the two Airlines equal: %s", Airline2.equals(Airline3)));
        //System.out.print(Airline3.getAirlineName() + "\n");

        System.out.println("-----------------------------------------");

        Flight Flight2 = new Flight("11/15/2022 12:25", "New York", "Chicago", true);
        Flight Flight3 = new Flight("7/ 08/ 2021 6:12", "Chicago", "Sacramento", false);

        System.out.println(Flight2);
        System.out.println(String.format("Are the two Flights equal: %s", Flight2.equals(Flight3)));
        System.out.println("-----------------------------------------");
    }
}





