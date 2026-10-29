package MethodOverloading;

public class Main {

    public static void main(String[] args) {
        // Employee emp = new Employee(14392839L, "Tester 1", 1200);
        // emp.printDetails();
        // emp.update("Tester");

        // ConstructorExamples ce=new ConstructorExamples();
        // ce.printDetails();

        ConstructorChaining ccWithoutParams=new ConstructorChaining();
        ccWithoutParams.printDetails();

        ConstructorChaining ccWithOne=new ConstructorChaining("Kadal");
        ccWithOne.printDetails();

        ConstructorChaining ccWithTwo=new ConstructorChaining("Kadal",1_200_000_000_000L);
        ccWithTwo.printDetails();

        ConstructorChaining cc=new ConstructorChaining("Kadal",1_200_000_000_000L,64);
        cc.printDetails();
        //below code gives string representation of the object (address of the object in memory)
        //toString comes from java.lang.Object class which is the parent class of all classes in java
        //which means you can use any methods of java.lang.Object class in your own classes as well
        System.out.println("To string data: " + cc.toString());

        String dataStr=new String("Test data");
        //below code gives string representation of the parameter passed into the String constructor
        //which means String class has overridden the toString method of java.lang.Object class to give string representation of the parameter passed into the String constructor
        //thats inheritance
        System.out.println("String representation of the string object: " + dataStr.toString());

        Object obj=new Object();
        System.out.println("String representation of the object: " + obj.toString());

        Object obj1=new Object();
        System.out.println("String representation of the object: " + obj1.toString());
        //below code checks if both the objects are equal or not in memory location, since both the objects are created using new keyword, they will have different memory locations and hence will not be equal
        System.out.println("Is both equal: " + obj1.equals(obj));

        String str1=new String("Test data 1");
        System.out.println("String representation of the string object: " + str1.toString());
        //here strings are compared based on the content of the string and not based on the memory location like Object class, hence both the strings will be equal
        //the equals method of String class has overridden the equals method of java.lang.Object class to compare the content of the string and not the memory location
        System.out.println("Is both string equal: " + str1.equals(dataStr));

        InheritanceExample ie=new InheritanceExample(12322);
        //this method should have overrriden the default implementation of toString method written in java.lang.Object class;
        System.out.println("String representation of this class: "+ie.toString());

        InheritanceExample ieWithoutParams=new InheritanceExample();
        System.out.println("String representation of this class: "+ieWithoutParams.toString());


        //instanceof operator is used to check if object created is a instance of another object
        //left side of the keyword should be the object instance and right side should be the class name
        System.out.println("Is InheritanceExample instance of Object class: "+(ieWithoutParams instanceof Object));


        Object objss = new Object();
        //instanceof operator is used to check if object created is a instance of another object
        //below code returns true because instanceof operator has less precedence compared to + symbol, in println we have added + which has concatenated the string written in double quotes and objss so combination of these result in a string
        //so since the result is of type string, it would be like string instanceof String
        //so add paranthesis to give preferences to operators inside brackets to solve issue 
        System.out.println("Is Object instance of String class without brackets: "+ objss instanceof String);
        System.out.println("Is Object instance of String class: "+ (objss instanceof String));
    }

}