package ReflectionExamples;

import java.util.Random;

public class ClassLoaderExample {

    Random randomProductIdGenerator=new Random();
    long productId;
    String productName, productType;
    int productPrice;

    public ClassLoaderExample(){
        productId=randomProductIdGenerator.nextLong(10000000000L);
    }

    public ClassLoaderExample(String productName,String productType,int productPrice){
        //calls the constructor with same name but different parameter
        this();
        this.productName=productName;
        this.productType=productType;
        this.productPrice=productPrice;
    }

    //getters
    public long getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public String getProductType(){
        return productType;
    }
    public int getProductPrice(){
        return productPrice;
    }

    //overriding default method of toString method in Object class which implicitly extends in all of created class
    public String toString(){
        return String.format("Product id: %d\nProduct Name: %s\nProduct type: %s\nProduct price: %d", getProductId(),getProductName(), getProductType(),getProductPrice());
    }


}
