package InterfaceExamples;

public class Macbook implements ProfessionalLaptop{

    private Integer ramToAdd;
    private Long addSsdSize;
    private Boolean isTouchIncluded;
    private String modelName;

    public Macbook(String modelName,Integer ramToAdd,Long addSsdSize,Boolean isTouchIncluded){
        this.modelName=modelName;
        this.ramToAdd=ramToAdd;
        this.addSsdSize=addSsdSize;
        this.isTouchIncluded=isTouchIncluded;
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
    public String doesIncludeTouchScreen(){
        if(this.isTouchIncluded){
            return "Yes touchscreen included";
        }
        return "No touchscreen not included";
    }




}
