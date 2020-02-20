package com.company;

public class Main {

    public static void main(String[] args) {
        Box<Double,Integer> box = new Box<Double, Integer>(5.2,2 );
        Box<Float,Float>box1= new Box<Float, Float>(2.2f,2.3f);

        addition(box);
        multiplication(box1);



    }
    public static void addition (Box< ?,? extends Number  >box ){
        System.out.println(box.getNumber1().doubleValue() + box.getNumber2().intValue() +
                box.getNumber1().floatValue()+ box.getNumber2().floatValue());
    }
    public static void multiplication(Box< ?,? extends Number  >box ) {
        System.out.println(box.getNumber1().doubleValue() * box.getNumber2().intValue() *
            box.getNumber1().floatValue()* box.getNumber2().floatValue());
    }

}
