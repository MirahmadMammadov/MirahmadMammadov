public class MassivTest {
    public static void main(String[] args) {

        String str = "Java";
        //        str.toCharArray()[]
//        str.toCharArray()[0] = 'K';
//        System.out.println(str);
        int[] arr = new int[5];
        Integer[] arrInt = new Integer[5];
//        exception
//        arrInt[arrInt.length] = new Integer(10);
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //        exception
//        arr[arr.length] = 10;
//        incorrect
//        int arr1[] = new int[10];
//        literal
        int[] arrLiteral = {1, 2, 3, 5, 76};
        for (int i = 0; i < arrLiteral.length; i++) {
            System.out.print(arrLiteral[i] + " ");
        }
    }
}