package MethodOverloading;

public class ConstructorExamples {

    //here this initialization won't work because Constructors override the initialization since constructor executes after this initialization
    private String llms="Sonnet";
    private Long noOfParams=1_200_000_000_000L;
    private int ramSupportedInGb=128;

    //note: constructors will not have return value
    public ConstructorExamples(){
        llms="Kadal";
        noOfParams=1_200_000_000_000L;
        ramSupportedInGb=64;
    }

    public void printDetails() {
        System.out.format("Llms: %s, No of params: %d and Ram supported: %d\n",llms,noOfParams,ramSupportedInGb);
    }

}
