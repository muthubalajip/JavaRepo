package InterfaceExamples;

import java.util.Calendar;

public interface ComputerSpecifications {

    //by default, variable is public static final, meaning we cannot edit the value specified here
    String inbuiltLm="Copilot included";

    //these below methods are public by default
    String addRam();
    String addSsdSizeInKbs();
    String runAntiVirusSoftware();
    String osName();
    //if there are any methods to be added in interface, we should implement this method for sure in classes that implement this interface
    //but what if those classes already implemented this interface but a method should be a default implementation for all interfaces?
    //this is where default method comes into picture
    //this is a bad practice since as per software principle, classes should be open for extension but closed for modifications, it applies for interfaces as well
    //so ita bad practice to change interfaces after release since it may cause problems in the class which implements this interface.
    //so when there is a valid business, this should suffice
    //we can also override the below methods as per the convenience for the classe who implements this interface
    default String releaseDate(){
        return getReleaseDate();
    }

    Calendar cl=Calendar.getInstance();
    //interface classes can have static methods as well
    static String getReleaseDate(){
        return String.format("%s-%s-%s",cl.get(Calendar.DAY_OF_MONTH),cl.get(Calendar.MONTH),cl.get(Calendar.YEAR));
    }

}
