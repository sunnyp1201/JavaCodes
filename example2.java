class staticmemberfun{
    public static int emp_id;
    public static int getsid(int id){
       return emp_id=id;

    }
}

public class example2 {
    public static void main(String[] args) {
        int s=staticmemberfun.getsid(5);
        System.out.println(s);
    }
}
