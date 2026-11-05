package InterfaceExamples;

public interface ComputerSpecifications {

    //by default, variable is public static final, meaning we cannot edit the value specified here
    String inbuiltLm="Copilot included";

    //these below methods are public by default
    String addRam();
    String addSsdSizeInKbs();
    String runAntiVirusSoftware();

}
