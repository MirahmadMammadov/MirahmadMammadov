public class BuildTest {
    public static void main(String[] args) {
//        StringBuilder sb1 = new StringBuilder();
        String str = "Java";
        StringBuilder sb2 = new StringBuilder(str);
//        System.out.println(sb1);
        System.out.println(sb2);
        String addStr = " for beginners";
        sb2.append(addStr);
        System.out.println(sb2);
        System.out.println("capacity = " + sb2.capacity());
        System.out.println("length = " + sb2.length());
        sb2.append("!!!!!");
        System.out.println("capacity = " + sb2.capacity());
        System.out.println("length = " + sb2.length());
        StringBuilder sql = new StringBuilder("SELECT * FROM");
        sql.append(" Employee");
        System.out.println(sql);
        sql.append(" AS emp\nINNER JOIN Address addr ON emp.id = addr.emp_id AND emp.city like '%NY%");
        System.out.println(sql);
    }
}
