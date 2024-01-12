// interface A{

//     void fun1();
// }

// class B implements A{
//    public void fun1(){
//     System.out.println("hello this is the derived class and his super class");
//     }
// }


// public class Interface {
//     public static void main(String[] args) {
        
//         B obj = new B();
//         obj.fun1();
//     }
    
// }



interface i1{
    void fun1();
}

interface i2{
    void fun2();
}

interface i3{
    void fun3();
}

interface i4{
    void fun4();
}

class A{

}
class B extends A implements i1,i2,i3,i4{
   public void fun1(){

    }

    public void fun2(){

    }

    public void fun3(){

    }

    public void fun4(){

    }
}

public class Interface {

    public static void main(String[] args) {
        B obj = new B();
        obj.fun1();
        obj.fun2();
        obj.fun3();
        obj.fun4();
        
    }
}


