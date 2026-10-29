package MethodOverloading;

public class InheritanceExample {

    private int id;

    public InheritanceExample() {
    }

    public InheritanceExample(int id) {
        this.id = id;
    }
    

    public String toString(){
        if(id==0){
            return "";
        }
        return ""+id;
    }



}
