package Lesson1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner1.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner1.nextInt();
        //------------------------------------


        int multiplication = num1 * num2;
        int division = num1 / num2;


        System.out.println(num1 + "*" + num2);
        System.out.println("Answer: " + multiplication);

        ;
        System.out.println();
        System.out.println(num1 + "/" + num2);
        System.out.println("Answer: +" + division);
    }


}



