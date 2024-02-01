package package_12;

import java.util.Arrays;

public class arrayexample {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 6;
        array[1] = 9;
        array[2] = 6;

        System.out.println(Arrays.toString(array));
        System.out.println(array[0] + array[1] + array[2]);

        array[0] = 10;
        System.out.println(array[0] + array[1] + array[2]);

        array[2] = 10;
        System.out.println(array[0] == array[2]);

        String[] stringArray = {"word 1", "word 2", "word 3"};

        stringArray[0] = stringArray[0].trim();
        System.out.println(Arrays.toString(stringArray));
    }


}