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
    }

}