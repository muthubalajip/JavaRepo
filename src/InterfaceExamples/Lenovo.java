package InterfaceExamples;

//multiple inheritance is supported via multiple interfaces
public class Lenovo implements BusinessLaptop,ComputerSpecifications{
    private Integer ramToAdd;
    private Long addSsdSize;
    private String modelName;
    private String encryptionTypeForFiles;
    private String buildMaterialUsed;
    private String getOsName;

    public Lenovo(String modelName,Integer ramToAdd,Long addSsdSize,String encryptionTypeForFiles,String buildMaterialUsed,String getOsName){
        this.modelName=modelName;
        this.ramToAdd=ramToAdd;
        this.addSsdSize=addSsdSize;
        this.encryptionTypeForFiles=encryptionTypeForFiles;
        this.buildMaterialUsed=buildMaterialUsed;
        this.getOsName=getOsName;
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

    //these below methods are available at BusinessLaptop interface
    @Override
    public String securityModels(){
        return "For this laptop files, "+encryptionTypeForFiles+" is used";
    }
    @Override
    public String buildMaterial(){
        return "For build quality, "+buildMaterialUsed+" is used";
    }

    //this method is available in both ComputerSpecifications and BusinessLaptop interface
    //we can implement this method only once
    @Override
    public String osName(){
        return "Laptop is running on "+getOsName; 
    }

    

}
