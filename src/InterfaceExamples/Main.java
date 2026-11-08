package InterfaceExamples;

public class Main {

    public static void main(String[] args) {

        ComputerSpecificationsImplementation csi=new ComputerSpecificationsImplementation(128,1_000_000_000_000_000L,"Windows 10");

        //below code is also possible since interface ComputerSpecifications can hold instance of ComputerSpecificationsImplementation
        //ComputerSpecifications csiInterface=new ComputerSpecificationsImplementation();

        System.out.println(csi.addRam());
        System.out.println(csi.addSsdSizeInKbs());
        System.out.println(csi.runAntiVirusSoftware());

        System.out.println("csi Instance of ComputerSpecificationsImplementation? "+(csi instanceof ComputerSpecificationsImplementation));
        //the below code would return true since instance of the class which is implementing that interface could be instance of that interface as well
        System.out.println("csi Instance of ComputerSpecifications interface? "+(csi instanceof ComputerSpecifications));

        System.out.println("csi class? "+(csi.getClass()));

        ComputerSpecifications csiInterface=new ComputerSpecificationsImplementation(64,512_000_000_000L,"Kali 2.1");
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

        
        Macbook mb=new Macbook("Macbook Air M5",24,512_000_000_000L,true);
        //since macbook implements ProfessionalLaptop which is a derived class of ComputerSpecifications, below code would return true
        System.out.println("mb Instance of GamingLaptop interface? "+(mb instanceof ComputerSpecifications));
        //though GamingLaptop implements ComputerSpecifications, mb is not a instance of it because ProfessionalLaptop is the one which is implemented by Macbook class
        //both ProfessionalLaptop and GamingLaptop are independent Interfaces with their own method signatures to implement
        System.out.println("mb Instance of GamingLaptop interface? "+(mb instanceof GamingLaptop));
        

        ComputerSpecifications len=new Lenovo("Thinkpad 2002",32,512_000_000_000L,"Fingerprint scanner, Facial Recognition","Aluminum Body","Windows 10");

        System.out.println("len Instance of BusinessLaptop interface? "+(len instanceof BusinessLaptop));
        System.out.println("len Instance of ComputerSpecifications interface? "+(len instanceof ComputerSpecifications));
        //this method is available in ComputerSpecifications interface so this will not throw any error
        System.out.println(len.addRam());

        //error: The method securityModels() is undefined for the type ComputerSpecifications
        //because securityModels() methods is available only at BusinessLaptop interface since instance len is of ComputerSpecifications type, it does not have that method name 
        //len.securityModels();

        Lenovo lenLap=new Lenovo("Legion 3802",16,512_000_000_000L,"Fingerprint scanner, Facial Recognition","Aluminum Body","Windows 11");
        System.out.println(lenLap.addRam());
        System.out.println(lenLap.securityModels());

        BusinessLaptop lenLapB=new Lenovo("Ideapad 7292",16,512_000_000_000L,"Fingerprint scanner","Aluminum Body","Fedora 2.5");
        //error: The method addRam() is undefined for the type BusinessLaptop
        //because the type for variable lenLapB is of BusinessLaptop type and that interface is not having the below method, only Lenovo class has
        //System.out.println(lenLapB.addRam());
        System.out.println(lenLapB.securityModels());

        System.out.println("Release date of Lenovo Thinkpad: "+len.releaseDate());
        System.out.println("Release date of Macbook: "+mb.releaseDate());

        System.out.println("Release date of Dell Inspiron: "+gld.releaseDate());


        ComputerSpecifications bls=new Lenovo("Yoga 7i", 32, 512_000_000_000L, "Fingerprint Sensor", "Titanium Guard", "Windows 11");
        System.out.println("Release date of Lenovo Yoga 7i: "+bls.releaseDate());

        ComputerSpecifications mpe=new MacbookPrototypeExtended("Macbook M6",24,1_000_000_000_000_000L,"MacOS","2026-10-27");
        System.out.println("Proposed Release date of Macbook M6: "+mpe.releaseDate());
    }

}
