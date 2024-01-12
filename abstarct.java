
// abstract class Innerabstarct {
//  private int x;
//     public void definex(){
//           System.out.println("The value of the x is"+ x);
    
//     }}
// public class abstarct extends Innerabstarct {
//     public static void main(String[] args) {
//         abstarct ab=new abstarct();
//         ab.definex();

//     }
//     }


abstract class A {

    abstract void getresult();

}

class B extends A {

    public void getresult(){
        System.out.println("hello this is our result ");
    }

}

public class abstarct{
    public static void main(String[] args) {
        B obj = new B();
        obj.getresult();
    }
}

