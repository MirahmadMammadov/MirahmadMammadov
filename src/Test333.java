public class Test333 {
    public static void main(String []args){
      /*  Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        int limit = input.nextInt();
        for(int i=limit;i > 0;i--){
            System.out.println(i);
        }*/
      //  int  j=0;
       // for (int i = 1; i >= 1; i++) {
         //   System.out.println(i);
          //  System.out.println("Java");
        //}
//
     //   for (;;) {
       //     System.out.println("infinite loop");
       // }
      /*  int j = 0;
        for (;;) {
            System.out.println("infinite loop");
            if (j == 1000) {
                System.out.println("You entered too many fail values.");
                break;
            }
            j++;
        }*/
      /*  Scanner numb = new Scanner(System.in);
       System.out.println("add");
        int num =numb.nextInt();
        int res =1;
        for(int i=1;i<=num;i++){
            res *= i;

       /* for(int i =0;i < num;i++){
            if(i % 2 ==0){
                System.out.println("even numb" +i);
            }*/
      //  for(int i =0;i<num;i++){
        //    System.out.println(num *3);
       // }
       // System.out.println(res);

      /*  for(int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
            }
            System.out.println();
        }*/
       /* for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
      /*  Показать на экране прямоугольник размером MxN, состоящий из звёздочек.
        Затем сделать то же самое, но чтоб фигура внутри была пустая (остаётся только рамка).
        int numM =5;
        int numN = 5;
        for(int i =0;i < numM;i++){
            for(int j = 0 ;j < numN;j++){
                if(i==0 || i==numM-1){
                    System.out.print("*");
                } else if (j==0 || j==numN-1) {
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }


            }
            System.out.println();*/
       /* Написать программу, которая выводят на экран ромб (длины диагоналей ромба одинаковы по значению,но могут быть равны любому числу).
        Затем сделать то же самое, но чтоб фигура внутри была пустая (остаётся только контур).*/

     //   int i = 0;
            int diagonal = 10;
            int height = diagonal / 2;
//        upper
            for (int j = 0; j <= height; j++) {
                for (int i = 0; i <= diagonal; i++) {
                    if (i <= height + j && i >= height - j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
//      down
            for (int j = height; j < diagonal; j++) {
                for (int i = 0; i < diagonal; i++) {
                    if (i <= height + diagonal - j - 1 && i >= j - height + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
        }
        

        }





