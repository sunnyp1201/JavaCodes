class a {
    private int a=2;
    public void enda(int b,int c){
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
    }
}

class b extends a{

    private int a=5;
    public void enda(int c){
         System.out.println(a);
    }
}

public class overloading{
     public static void main(String[] args) {
        b b1=new b();
        b1.enda(12);
        b1.enda(13, 15);
     }
}
