package Example.Cal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int a = 10;
        int b = 2;
        calc.calculateAndPrint(a, b);

        a = sc.nextInt();
        b = sc.nextInt();

        calc.calculateAndPrint(a, b);
    }
}
