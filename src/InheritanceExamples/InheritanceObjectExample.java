package InheritanceExamples;

public class InheritanceObjectExample {

    public String llmExample="Testing";

    public String getInheritanceStrEx(){
        return llmExample;
    }

    public Object dataObjs=new Object();

    public void printData(){
        System.out.println("Object data: "+dataObjs);
    }
    
    public void setInheritanceStrEx(String llmExample){
        
        this.llmExample=llmExample;
    }

    public void showDetails(){
        System.out.println("Details: "+llmExample);
    }

    
}
