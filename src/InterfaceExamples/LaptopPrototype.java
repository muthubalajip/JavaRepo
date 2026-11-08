package InterfaceExamples;

//if the class is declared abstract, then there is nothing to force by interface class ComputerSpecifications to implement certain methods from that interface
public abstract class LaptopPrototype implements ComputerSpecifications{

    private String modelName,getOsName;
    private int ramToAdd;
    private Long addSsdSize;
    public LaptopPrototype(String modelName,int ramToAdd,Long addSsdSize,String getOsName){
        this.modelName=modelName;
        this.ramToAdd=ramToAdd;
        this.addSsdSize=addSsdSize;
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

    @Override
    public String osName(){
        return "Laptop is running on "+getOsName; 
    }

    @Override 
    //error: This method requires a body instead of a semicolon - if abstract keyword is not given
    //this method can be implemented in the child class or derived class that extends this abstract class
    public abstract String releaseDate();

}
