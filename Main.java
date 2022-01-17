package HW1;

//import org.depaul.se350.classdesignexample.Product;
//import org.depaul.se350.classdesignexample.exception.BadParameterException;
//import org.depaul.se350.classdesignexample.exception.NullParameterException;

public class Main {
    public static void main(String[] args) //throws BadParameterException, NullParameterException
    {
        Airport Airport2 = new Airport("Airport A", "Chicago", "USA");
        Airport Airport3 = new Airport("Airport A", "Chicago", "USA");

        System.out.println(Airport2);
        System.out.println(String.format("Are the two Airports equal: %s", Airport2.equals(Airport3)));
    }
}



