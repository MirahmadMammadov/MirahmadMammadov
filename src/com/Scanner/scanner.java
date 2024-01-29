package com.Scanner;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("add 1 number:");
        float num1 = scan.nextFloat();

        System.out.println("add 2 number:");
        float num2 = scan.nextFloat();

        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;


        System.out.println("Answer:");
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4 + "\n");


    }
}
