package InheritanceExamples;

public class InheritanceObjectExampleChildChild extends InheritanceObjectExample {

    public String llmExample="Claude";

     public String getInheritanceStrExChild(){
        return llmExample;
    }

    public void setInheritanceStrExChild(String llmExample){
        
        this.llmExample=llmExample;
    }

    public void showDetailsChild(){
        System.out.println("Details: "+llmExample);
    }

    
    public void showTesting(){
        System.out.println("From InheritanceObjectExampleChildChild");
    }

    public void printData(){
        System.out.println("Object data: "+dataObjs);
    }


}
