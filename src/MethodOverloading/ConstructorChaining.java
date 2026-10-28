package MethodOverloading;

public class ConstructorChaining {

    private String llms;
    private Long noOfParams;
    private int ramSupportedInGb;

    public ConstructorChaining(String llms,long noOfParams,int ramSupportedInGb){
        //will call two parameter constructor above so that repititive code eliminated`
        
        this.ramSupportedInGb=ramSupportedInGb;
        this(llms,noOfParams);
    }

    public ConstructorChaining(String llms,long noOfParams){
        //will call one parameter constructor above so that repititive code eliminated`
        
        this.noOfParams=noOfParams;
        this(llms);
    }

    //parametarized constructor
    public ConstructorChaining(String llms){
        this.llms=llms;
    }
    //default constructor
    public ConstructorChaining(){

    }

    public void printDetails() {
        System.out.format("Llms: %s, No of params: %d and Ram supported: %d\n",llms,noOfParams,ramSupportedInGb);
    }
}
