import java.util.Arrays;
import java.util.Random;
public class MehrMassiv {
            public static void main(String[] args) {
                int[][] arr = new int[5][5];
                Random r = new Random();
                int sum = 0;
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                System.out.println();
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        arr[i][j] = r.nextInt(0,21);
                        sum += arr[i][j];
                        if (arr[i][j] < min) {
                            min = arr[i][j];
                        }
                        if (arr[i][j] > max) {
                            max = arr[i][j];
                        }
                    }
                    System.out.print(Arrays.toString(arr[i]));
                }
                double avg = (double) sum / (arr.length * arr[0].length);
                System.out.println("\nСумма элементов массива: " + sum);
                System.out.println("Среднее ар-е: " + avg);
                System.out.println("Минимальный эл: " + min);
                System.out.println("Макс эл: " + max);
            }
        }


