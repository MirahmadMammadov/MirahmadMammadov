import java.util.Scanner;

public class ScanerExample {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Add your password. ");
        int num1 = scanner1.nextInt();

        //--------------------------------------

        if (num1 == 2464) {
            System.out.println("Password correct");
            System.out.println("Add which currency yuo wanna take out");


        } else {
            System.out.println("password is not correct");
            System.out.println("Repeat again");
        }


    }
}

