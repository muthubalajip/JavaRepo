package ReflectionExamples;

import java.net.http.HttpClient;
public class Main {

    public static void main(String[] args){
        ClassLoaderExample cle=new ClassLoaderExample("Macbook M4 Air","Laptop",120000);
        System.out.println(cle.toString());
        //should give the class name since ClassLoaderExample is the class which is gonna be converted from .java to .class by Java compiler for JVM to understand the Java bytecode generated
        //for user defined class, the class loader returned would be AppClassLoader (also called as SystemLoader)
        System.out.println("Class loader loaded for ClassLoaderExample class: "+ClassLoaderExample.class.getClassLoader());
        System.out.println("Class loader loaded for Main: "+Main.class.getClassLoader());
        //for built in class, the class loader returned would be PlatformClassLoader
        System.out.println("Class loader loaded for HttpClient: "+HttpClient.class.getClassLoader());

    }

}
