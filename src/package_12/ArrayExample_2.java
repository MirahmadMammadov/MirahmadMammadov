package package_12;

import java.util.Arrays;

public class ArrayExample_2 {
    public static void main(String[] args) {
        int[] oldArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
        System.out.println((Arrays.toString(oldArray)));

        int[] newArray = new int[oldArray.length / 2];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = oldArray[i];


        }
        System.out.println(Arrays.toString(oldArray));
        System.out.println(Arrays.toString(newArray));


        // int[] newArray = new int[10];


        //  for (int i = 0; i < oldArray.length; i++) ;
        //   newArray[i] = oldArray[i] / 10;
    }
    // System.out.println(Arrays.toString(oldArray));

}

