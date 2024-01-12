package practise;

class box{
    private int length,breadth,height;
    public void setDimension(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
        }

    public void showDimension(){
        System.out.println("your length is "+length);
         System.out.println("your breadth is "+breadth);
          System.out.println("your height is "+height);
    }
}

 public class example {
    public static void main(String[] args) {
        box b1=new box();
        b1.setDimension(5, 10, 29);
        b1.showDimension();
    }
}
