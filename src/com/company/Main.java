package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Ivo");
        int number = 6;
        int numberTwo = 7;
        System.out.println(number +numberTwo);
        System.out.println(number -numberTwo);
        System.out.println(number * numberTwo);
        System.out.println(number / numberTwo);
        System.out.println(number % numberTwo);

        if (number>numberTwo){
            System.out.println("That is true");
        }
        else System.out.println("That is wrong");
        float price = 2.57F;
        boolean bool = true;
        double priceTwo = 2.965;

        System.out.println(price);
        System.out.println(priceTwo);
        System.out.println();
        System.out.println(bool);

        String name = "Tomy";
        name = "Ivo";

        System.out.println(name);

        double a = 3.5;
        double b = 2.0;
        a++;
        b--;
        System.out.println(a);
        System.out.println(b);

    }
}
