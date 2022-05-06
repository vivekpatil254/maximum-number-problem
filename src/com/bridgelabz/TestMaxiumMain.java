package com.bridgelabz;

public class TestMaxiumMain {

    public static void main(String[] args) {
        TestMaxiumMain object =new TestMaxiumMain();
        object.compereTo(500,400,350);
        object.compereTo(500,800,350);
        object.compereTo(500,400,900);

        object.compereTo((float)500.89,(float)400.50,(float)350.52);
        object.compereTo((float)500.50,(float)800.25,(float)350.25);
        object.compereTo((float)500.25,(float)400.26,(float)900.89);

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

    public void compereTo(Float object1, Float object2, Float object3)
    {
        if(object1>object2 && object1 > object3)
            System.out.println("The "+object1+" is maximum number among three numbers.");
        else if(object2>object1 && object2 > object3)
            System.out.println("The "+object2+" is maximum number among three numbers.");
        else
            System.out.println("The "+object3+" is maximum number among three numbers.");
    }


}
