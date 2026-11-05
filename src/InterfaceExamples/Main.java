package InterfaceExamples;

public class Main {

    public static void main(String[] args) {

        ComputerSpecificationsImplementation csi=new ComputerSpecificationsImplementation(128,1_000_000_000_000_000L);

        //below code is also possible since interface ComputerSpecifications can hold instance of ComputerSpecificationsImplementation
        //ComputerSpecifications csiInterface=new ComputerSpecificationsImplementation();

        System.out.println(csi.addRam());
        System.out.println(csi.addSsdSizeInKbs());
        System.out.println(csi.runAntiVirusSoftware());

        System.out.println("csi Instance of ComputerSpecificationsImplementation? "+(csi instanceof ComputerSpecificationsImplementation));
        //the below code would return true since instance of the class which is implementing that interface could be instance of that interface as well
        System.out.println("csi Instance of ComputerSpecifications interface? "+(csi instanceof ComputerSpecifications));

        System.out.println("csi class? "+(csi.getClass()));

        ComputerSpecifications csiInterface=new ComputerSpecificationsImplementation(64,512_000_000_000L);
        System.out.println("csiInterface class? "+(csiInterface.getClass()));

        System.out.println(csiInterface.addRam());
        System.out.println(csiInterface.addSsdSizeInKbs());
        System.out.println(csiInterface.runAntiVirusSoftware());


        //derived or child class instance of ComputerSpecifications interface

        Dell gl=new Dell("Dell XPS 512",64,512_000_000_000L,"RTX Spark");

        
        System.out.println(gl.addRam());
        System.out.println(gl.addSsdSizeInKbs());
        System.out.println(gl.runAntiVirusSoftware());

        System.out.println("gl Instance of GamingLaptop interface? "+(gl instanceof GamingLaptop));

        System.out.println("gl Instance of ComputerSpecifications interface? "+(gl instanceof ComputerSpecifications));

        System.out.println("Is copilot included? "+gl.isLlmIncluded());

        GamingLaptop gld=new Dell("Dell Inspiron 500",64,512_000_000_000L,"RTX 4050");
        
        //error: The final field ComputerSpecifications.inbuiltLm cannot be assigned
        //gld.inbuiltLm="Copilot not included";

        System.out.println("Is llm included: "+GamingLaptop.inbuiltLm);

        
        Macbook mb=new Macbook("Macbook Air M4",24,512_000_000_000L,true);
        //since macbook implements ProfessionalLaptop which is a derived class of ComputerSpecifications, below code would return true
        System.out.println("mb Instance of GamingLaptop interface? "+(mb instanceof ComputerSpecifications));
        //though GamingLaptop implements ComputerSpecifications, mb is not a instance of it because ProfessionalLaptop is the one which is implemented by Macbook class
        //both ProfessionalLaptop and GamingLaptop are independent Interfaces with their own method signatures to implement
        System.out.println("mb Instance of GamingLaptop interface? "+(mb instanceof GamingLaptop));





    }

}
