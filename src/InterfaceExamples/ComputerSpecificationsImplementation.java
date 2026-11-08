package InterfaceExamples;


//if we do not implement here anything, this class is by default abstract
public class ComputerSpecificationsImplementation implements ComputerSpecifications {


    private Integer ramToAdd;
    private Long addSsdSize;
    private String getOsName;

    public ComputerSpecificationsImplementation(Integer ramToAdd,Long addSsdSize,String getOsName){
        this.ramToAdd=ramToAdd;
        this.addSsdSize=addSsdSize;
        this.getOsName=getOsName;
    }

    @Override
    public String addRam() {
        return "Adding "+ ramToAdd +"GB ram to the Computer";
    }

    @Override
    public String addSsdSizeInKbs() {
        return "Ssd size added: "+addSsdSize;
    }

    @Override
    public String runAntiVirusSoftware() {
        return "Running Antivirus Software";
    }

    @Override
    public String osName() {
        return "Laptop is running on "+getOsName;
    }

    

}
