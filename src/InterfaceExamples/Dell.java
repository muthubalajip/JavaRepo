package InterfaceExamples;

public class Dell implements GamingLaptop{

    private Integer ramToAdd;
    private Long addSsdSize;
    private String graphicsCardName;
    private String modelName;

    public Dell(String modelName,Integer ramToAdd,Long addSsdSize, String graphicsCardName){
        this.modelName=modelName;
        this.ramToAdd=ramToAdd;
        this.addSsdSize=addSsdSize;
        this.graphicsCardName=graphicsCardName;

    }

    @Override
    public String addRam() {
        return "Adding "+ ramToAdd +"GB ram to the model "+modelName;
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


    @Override
    public String graphicsCardUsed(){
        return "For this laptop "+graphicsCardName+" is used";
    }

    @Override
    public String osName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'osName'");
    }
    

}
