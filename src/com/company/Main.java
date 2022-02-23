package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
	// write your code here
       System.out.println("Ivo's Homework");
       System.out.println();

        int randomNum = ThreadLocalRandom.current().nextInt(1, 9 + 1);
        System.out.println("randomNum is - " + randomNum);

        if (randomNum> 5){
            System.out.println("It is greater then 5");
        }

    }
}
