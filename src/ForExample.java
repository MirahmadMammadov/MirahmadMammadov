public class ForExample {

    public static void main(String[] args) {
        // String[]names = new String[3];
        //  names[0] = "Ahmad";
        // names[1] = "Aqwin";
        // names[2] = "Faxis";

        String[] names = {"Ahmad", "Aqwin", "Faxis"};
        System.out.println(names);
        {

       /* for(int i=0;i< names.length;i++){
            System.out.println(names[i]);
            */


        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}

