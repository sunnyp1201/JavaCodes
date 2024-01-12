package allstatic;
// package allstatic;

class staticdatamember {

     int rollno;

    public static int admno=100;

    public void getsrollno(){
        rollno=10;
    }
    public class example{
    public static void main(String[] args) {
      staticdatamember sdm=new staticdatamember();
        sdm.getsrollno();
        System.out.println(admno);
    }
}
    
}

