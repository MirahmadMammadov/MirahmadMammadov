import java.sql.SQLOutput;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] intArray1 = new int[5];

        intArray1[0] = 0;
        intArray1[1] = 10;
        intArray1[2] = 11;
        System.out.println(Arrays.toString(intArray1));
        System.out.println("Dlina = " + intArray1.length);

        int[] arrayDublicate = intArray1.clone();

        System.out.println("sdealali");
        System.out.println("yes");


    }
}
