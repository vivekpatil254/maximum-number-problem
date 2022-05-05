package com.bridgelabz;

public class TestMaxiumMain {

    public static void main(String[] args) {
        TestMaxiumMain object =new TestMaxiumMain();
        object.compereTo(500,400,350);
        object.compereTo(500,800,350);

    }
    public void compereTo(Integer object1, Integer object2, Integer object3)
    {
        if(object1>object2 && object1 > object3)
            System.out.println("The "+object1+" is maximum number among three numbers.");
        else if(object2>object1 && object2 > object3)
            System.out.println("The "+object2+" is maximum number among three numbers.");
        else
            System.out.println("The "+object3+" is maximum number among three numbers.");
    }
}
