package InterfaceExamples;

public class Dell implements GamingLaptop{

    private Integer ramToAdd;
    private Long addSsdSize;

    public Dell(Integer ramToAdd,Long addSsdSize){
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

    public String isLlmIncluded(){
        return inbuiltLm;
    }

    

}
