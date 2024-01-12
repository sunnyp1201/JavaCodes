 import java.lang.Runnable;
class A implements Runnable{
 
   public void run(){ 
    for(int i=0; i<5; i++){
        System.out.println("This is the Thread A " +i);
    }
}
}

class B implements Runnable{

    public void run(){
    for(int i=0; i<5; i++){
        System.out.println("This is the Thread B " +i);
    }
}
}

public class Examplerunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A());
        Thread t2 =new Thread(new B());
        t1.start();
        t2.start();
    }
}
