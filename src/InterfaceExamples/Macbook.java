package InterfaceExamples;

import java.util.Calendar;

public class Macbook implements ProfessionalLaptop{

    private Integer ramToAdd;
    private Long addSsdSize;
    private Boolean isTouchIncluded;
    private String modelName;
    private String osUsed="MacOS";

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

    @Override
    public String osName(){
        return osUsed+" is used";
    }


    Calendar cl=Calendar.getInstance();

    //this below releaseDate method is available on ComputerSpecifications interface as default implementation
    //that default method in that interface can be overriden by classes like this by using @Override annotation
    @Override
    public String releaseDate(){
        return String.format("%s-%s-%s", cl.get(Calendar.YEAR),cl.get(Calendar.MONTH),cl.get(Calendar.DAY_OF_MONTH));
    }




}
