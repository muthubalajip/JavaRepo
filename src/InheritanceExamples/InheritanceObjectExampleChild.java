package InheritanceExamples;

public class InheritanceObjectExampleChild extends InheritanceObjectExample{

    public String llmExample="Kadal";

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
        System.out.println("From InheritanceObjectExampleChild");
    }

    //here dataObjs comes from base class
    //how ? when this derived class instance is created, base class does the initialization again
    //thereby creating fresh new object instance
    //thats why the output differs on every derived class that extending base class
    public void printData(){
        System.out.println("Object data: "+dataObjs);
    }




}
