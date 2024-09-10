public class MainPen {
        public static void main(String[] args) {
            Pen pen = new Pen();
            pen.setColor("red");
            Pen pen1 = new Pen();
            pen1.setColor("green");
            Pen pen2 = new Pen();
            pen2.setColor("violet");
            Pen[] penArr = {pen, pen1, pen2};
            for (int i = 0; i < penArr.length; i++){

                System.out.println(penArr[i].getColor());
            }
            penArr[0].setColor("Green");
            penArr[1].setColor("Red");
            penArr[2].setColor("Black");
            for (int i = 0; i < penArr.length; i++){

                System.out.println("new color: " + penArr[i].getColor());
            }
        }
    }


