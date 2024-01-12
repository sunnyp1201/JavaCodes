import java.lang.Thread;
class A extends Thread{

    public void run(){

        for(int i=0; i<5; i++){
            System.out.println("Thread A"+i);
        }
    }
}

class B extends Thread{

    public void run(){

        for(int i=0; i<5; i++){
            System.out.println("Thread B"+i);
        }
    }
}

public class Examplethread {
    public static void main(String[] args) {
        A t1=new A();
        B t2 = new B();
        t1.start();
        t2.start();
    }
}
