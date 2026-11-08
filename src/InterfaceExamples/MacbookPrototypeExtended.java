package InterfaceExamples;

//since LaptopPrototype is an abstract class, we are extending the abstract class which implements interface Automobile
public class MacbookPrototypeExtended extends LaptopPrototype{

    private String releaseDate;
    public MacbookPrototypeExtended(String modelName,int ramToAdd,Long addSsdSize,String getOsName,String releaseDate){

        //this below method calls parent constructor ie: LaptopPrototype
        super(modelName,ramToAdd,addSsdSize,getOsName);
        this.releaseDate=releaseDate;

    }

    //this method has to be implemented by this class since this method has been declared abstract and this class extends LaptopPrototype class
    @Override 
    public String releaseDate(){
        return releaseDate;
    }


}
