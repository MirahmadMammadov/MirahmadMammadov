import java.util.Random;

public class HomeWork {
    // Напишите метод, который принимает на вход количество студентов и “рандомально” выбирает любого студента начиная со второго включительно.
    // Например: в зуум сейчас присутствуют 10 участников. Первый участник - это преподаватель. Выбор должен быть сделан из 9 последующих
    //, т.е. число выбирается из диапазона 2-10.
    public static void main(String[] args) {
        int students = 50;
        //  getStudent(students);
        System.out.println(getStudent(students));
    }


        public static int getStudent (int students){
        Random rand = new Random();
        return rand.nextInt(1, students + 1);


    }
}





