package InterfaceExamples;


//if we do not implement here anything, this class is by default abstract
public class ComputerSpecificationsImplementation implements ComputerSpecifications {


    private Integer ramToAdd;
    private Long addSsdSize;

    public ComputerSpecificationsImplementation(Integer ramToAdd,Long addSsdSize){
        this.ramToAdd=ramToAdd;
        this.addSsdSize=addSsdSize;
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

    

}
