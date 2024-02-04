import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        System.out.println("Hello everyone\n" + "CurrencyConverter!\n" +
                "Choose your currency:\n" +
                "1.Euro\n" +
                "2.Usd\n" +
                "3.TL");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Add your password. ");
        int num1 = scanner1.nextInt();
        int num2 = scanner1.nextInt();

        //--------------------------------------


        if (num1 == 2464) {
            System.out.println("Password correct");
            System.out.println("Add which currency yuo wanna take out");


        } else {
            System.out.println("password is not correct");
            System.exit(-1);
            System.out.println("Repeat again");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add your number");
        int currencyFrom = scanner.nextInt();
        if (currencyFrom == 1) {
            System.out.println("FromEuro");
        } else if (currencyFrom == 2) {
            System.out.println("FromAmerican dollars");
        } else if (currencyFrom == 3) {
            System.out.println("FromTurkish lir");
        } else {
            System.out.println("unknown currency,bye");
            System.exit(-1);
        }

        System.out.println("Add number of currency: ");
        int currencyIn = scanner.nextInt();
        if (currencyIn == 1) {
            System.out.println("\n inEuro");
        } else if (currencyIn == 2) {
            System.out.println("\n in USD\n");
        } else if (currencyIn == 3) {
            System.out.println("IN turkish lir");
        } else {
            System.out.println("You add false currency.\n");
            System.exit(-1);
            System.out.println("Add transfer summa: ");
            double sum = scanner.nextDouble();
            double x;
            double y;
            if (currencyFrom == 1) {
                x = 1.0;
            } else if (currencyFrom == 2) {
                x = 0.92;

            } else {
                x = 0.03;
            }
            if (currencyIn == 1) {
                y = 1.0;
            } else if (currencyIn == 2) {
                y = 0.92;
            } else {
                y = 0.03;
            }
            double total = sum * x / y;
            System.out.println("\nYou get: ");
            System.out.println(total);
        }

    }

}














