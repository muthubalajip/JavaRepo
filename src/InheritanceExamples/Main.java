package InheritanceExamples;

public class Main {

    public static void main(String[] args) {

        InheritanceObjectExample ieo=new InheritanceObjectExample();

        InheritanceObjectExample ieoTest=new InheritanceObjectExample();
        
        System.out.println("Is String? : "+(ieo.toString()));
        System.out.println("Is String for another object? : "+(ieoTest.toString()));

        System.out.println("Is InheritanceObjectExample instance of Object? : "+(ieo instanceof Object));

        //this will support since conversion from lower to higher precision type is possible
        Object objInst=ieo;

        System.out.println("Is InheritanceObjectExample instance of Object? : "+(objInst instanceof Object));
        System.out.println("Is String whereInheritanceObjectExample instance is assigned to Object ? : "+(objInst.toString()));

        //checks if the memory addresses of both objects are the same
        //if we are creating user defined constructor and does not specify any constructor ie: default constructor, then equals method by default checks if the memory address of both objects are same
        //here it returns true since we have initialized ieo to objInst where address of the ieo is shared by objInst as well
        System.out.println("Is InheritanceObjectExample and Object has same memory address? : "+(objInst.equals(ieo)));


        //cannot support since conversion from higher to lower precision type is not possible
        //InheritanceObjectExample ieo1=objInst;

        //this below code will always return true eventhough at compile time ie: during coding, ieo(InheritanceObjectExample type) instance assigned to Object type, instanceof knows which type of object is assigned to Object class
        //so at run time, ieo object would still be the type of InheritanceObjectExample though it was explicitly assigned to Object variable, at compile time it is different
        //this is where instance of makes sense because we do not know that if a variable is a instance of a particular class, at this point the keyword is useful
        System.out.println("Is Object assigned instance of InheritanceObjectExample? : "+(objInst instanceof InheritanceObjectExample));
        //you can confirm the above answer with the below ones
        System.out.println("Get class method which checks the class name of instance? : "+(objInst.getClass()));


        System.out.println("Inheritance example: "+ieo.getInheritanceStrEx());
        ieo.showDetails();

        //The method showDetails() is undefined for the type Object since eventhough at runtime, objInst.getClass() returns you the type as InheritanceObjectExample, you cannot access the methods with below instance
        //since it considers compile time assignment, ieo is now part of Object class type and showDetails() method is not available in Object instance thereby returning undefined error
        //Object class is a base class and InheritanceObjectExample is of derived class type, you can access base class methods using derived class instance but base class instances cannot able to access derived class methods so hence the error

        //its type of the variable that matters(assigned on left side of the assignment operator) when method invocation occurs
        //objInst.showDetails();

        //derived class
        InheritanceObjectExampleChild ioec=new InheritanceObjectExampleChild();
        //access properties and methods of base class ie: InheritanceObjectExample
        System.out.println("From base class");
        ioec.showDetails();

        System.out.println("Inheritance child example: "+ioec.getInheritanceStrEx());
        System.out.println("Inheritance grand child example class name: "+ioec.getClass());



        System.out.println("Is InheritanceObjectExampleChild(derived class) instance is a instance of InheritanceObjectExample(base class): "+(ioec instanceof InheritanceObjectExample));
        System.out.println("Is InheritanceObjectExampleChild(derived class) instance is a instance of Object(base grandparent class): "+(ioec instanceof Object));

        System.out.println("Is InheritanceObjectExample(base class) instance is a instance of InheritanceObjectExampleChild(derived class): "+(ieo instanceof InheritanceObjectExampleChild));
        //this calls method from derived class which override functionality of the same method in base class
        System.out.println("Calling child method: "+ioec.getInheritanceStrEx());

        //the below code will give you compile time error since getInheritanceStrExChild is available only on derived classes and not on base classes
        //base class instance cannot access methods or functionalities of derived classes, only vice versa is possible
        //error: The method getInheritanceStrExChild() is undefined for the type InheritanceObjectExample
        //this proves 
        //System.out.println("Calling derived class method from base class: "+ieo.getInheritanceStrExChild());


        //type of the object(left)=type of the object constructed(right)
        Object objss=new String();

        System.out.println("Is Object(base class) instance is a instance of String(derived class): "+(objss instanceof String));

        Object objss1=new InheritanceObjectExampleChild();

        System.out.println("Is Object(base class) instance is a instance of InheritanceObjectExampleChild(derived class): "+(objss1 instanceof InheritanceObjectExampleChild));
        System.out.println("Is Object(base class) instance is a instance of InheritanceObjectExample(base class for InheritanceObjectExampleChild but derived class for Object class): "+(objss1 instanceof InheritanceObjectExample));


        InheritanceObjectExample iooe=new InheritanceObjectExampleChild();

        //derived class cannot hold instance of base class
        //InheritanceObjectExampleChild iooec=new InheritanceObjectExample();

        System.out.println("Is InheritanceObjectExample(base class) instance is a instance of InheritanceObjectExampleChild(derived class): "+(iooe instanceof InheritanceObjectExampleChild));


        //base class instance cannot access methods or functionalities of derived classes, only vice versa is possible
        //to access derived class method, use down casting
        //but below code is still not safe to use
        ((InheritanceObjectExampleChild)iooe).showDetailsChild();


        Object objInherExample=new InheritanceObjectExample();

        //takes into account the runtime instance creation for InheritanceObjectExample
        System.out.println("objInherExample variable type : "+(objInherExample.getClass()));

        InheritanceObjectExample ioeech=new InheritanceObjectExampleChild();
        System.out.println("ioeech variable type : "+(ioeech.getClass()));

        //downcast and assign it to variable of base class

        InheritanceObjectExample testioe=(InheritanceObjectExample)objInherExample;

        System.out.println("testioe variable type : "+(testioe.getClass()));

        //throws runtime exception
        //ClassCastException: class InheritanceExamples.InheritanceObjectExample cannot be cast to class InheritanceExamples.InheritanceObjectExampleChild (InheritanceExamples.InheritanceObjectExample and InheritanceExamples.InheritanceObjectExampleChild are in unnamed module of loader 'app')
        // InheritanceObjectExampleChild chinh=(InheritanceObjectExampleChild)testioe;
        // System.out.println("chinh variable type : "+(chinh.getClass()));


        Object objssData=new InheritanceObjectExampleChild();
        System.out.println("objssData variable type : "+(objssData.getClass()));


        InheritanceObjectExample objsinher=(InheritanceObjectExample)objssData;
        System.out.println("objsinher variable type : "+(objsinher.getClass()));



        InheritanceObjectExample ihoe=new InheritanceObjectExample();
        InheritanceObjectExampleChild ihoec=new InheritanceObjectExampleChild();
        InheritanceObjectExampleChildChild ihoecc=new InheritanceObjectExampleChildChild();


        //calling the base class methods via derived class variables
        ihoe.showDetails();

        ihoec.showDetails();

        ihoecc.showDetails();


        ihoe.setInheritanceStrEx("Kimi");
        ihoec.setInheritanceStrEx("Gemini");
        ihoecc.setInheritanceStrEx("Gpt");

        System.out.println("InheritanceObjectExample getter method called:"+ihoe.getInheritanceStrEx());
        System.out.println("InheritanceObjectExampleChild getter method called:"+ihoec.getInheritanceStrEx());
        System.out.println("InheritanceObjectExampleChildChild getter method called:"+ihoecc.getInheritanceStrEx());

        //showTEsting is in both classes but in background, derived classes override functionality of same methods mentioned in base class
        ihoec.showTesting();
        ihoecc.showTesting();
        
        System.out.println("LLm example variable from base class: "+ihoe.llmExample);

        System.out.println("Derived class variable accessing variable from base class: "+ihoecc.llmExample);


        ihoe.printData();
        ihoec.printData();
        ihoecc.printData();

    }

}