class A{
    public void fun1(){
      System.out.println("hello world1");
    }
}

class B extends A{
    public void fun1(){
      System.out.println("hello world2");
    }
}

public class overriding {
    public static void main(String[] args) {
        A b1=new A();
        b1.fun1();
    }
    
}
