import java.util.Random;

public class Test444 {
    public static void main(String[] args) {
    /*    int a = 10;
        if(a==15){
            System.out.println("open");
        }
        System.out.println("I'm not in if ");
    }*/
      /*  int num = 10;
        boolean isOpen = true;
//      if-else
        boolean isCanBuy = false;
        if(isOpen && isCanBuy) {
            System.out.println("Buy something");
        } else {
            System.out.println("Can't buy");
        }*/
      /*  int currentTime = 10;
        int timeStart = 9;
        int timeEnd = 17;
        boolean isOpen;// = false
        if (currentTime >= timeStart && currentTime <= timeEnd) {
            isOpen = true;
        } else {
            isOpen = false;
        }
        int a =10;
        if(a>15){
            System.out.println("a > 15");
        }else{
            System.out.println("a < 15");
        }*/
        //Создайте и инициализируйте переменную int
        //В блоке if сравните созданную переменную i со значением 10 (!=)
        //Внутри блока добавьте блок if и сравните переменную со значением 15 , внутри блока добавить инструкцию System.out.println("i is smaller than 15");
        //Добавите еще один блок if-else и сравните переменную со значением 12
        //В блоке if добавить инструкцию System.out.println("i is smaller than 12 too")
        //В блоке else добавьте инструкцию System.out.println("i is greater than 12");
        //Проанализируйте вывод
        /*int num = 15;
        if (num !=10){
            System.out.println(".");
        }
        if(num>= 15){
            System.out.println("num < 15");
        }else{
            System.out.println("num >12");
        }*/
     /*   int s = 20;
        if(s==10){
            System.out.println("answer:10");
        }
         else if (s == 15) {
            System.out.println("answer:15");

        } else if (s==20) {
            System.out.println("answer:20");
            
        }else{
            System.out.println("answer:x");

        }*/
       /* int balance = 100;
        int withdraw = 200;
        if (balance > 0 && balance < 200) {
            System.out.println("Balance is OK");
            return;
        }
        if (withdraw <= balance) {
            System.out.println("Withdraw");
        } else {
            System.out.println("Not enough money");
        }*/
        /*Создайте и инициализируйте переменную boolean t = true;
Добавьте инструкцию System.out.println("Before the return instruction");
В блоке if определите оператор return
Добавьте инструкцию после блока if System.out.println("This won't execute");
Запустите код
Проанализируйте вывод используя режим дебаггера
Переопределите переменную t = false
Проанализируйте вывод используя режим дебаггера */
       /* boolean t = true;
        System.out.println("before");
        if(t){
            return;
        }
        System.out.println("this wont execute");*/

        /*
       Создать программу, проверяющую и сообщающую на экран,
        является ли целое число записанное в переменную n, чётным либо нечётным.
         */
       /* Scanner scan = new Scanner(System.in);
        System.out.println("add number");
        int numb = scan.nextInt();
        if(numb % 2 == 0){
            System.out.println("even numb");

        }else {
            System.out.println("odd number ");
        }*/
        //Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155]
        // целое число в интервал (25;100) и сообщать результат на экран.
        Random rand = new Random();
        int numb = rand.nextInt(5,155);
        if( numb >25 && numb< 100) {
            System.out.println("+");
        }
            else if (numb>=5 && numb<=155) {
            System.out.println("-");

        }else {
            System.out.println("-=");
        }


    }
}
