package box;
class box {

    int length,breadth,height;
 public void setDimension(int l,int b,int h){
    length=l;
    breadth=b;
    height=h;

 }
 public void showDimension(){
    System.out.println("l =" +length);
    System.out.println("b =" +breadth);
    System.out.println("b =" +height);

 }
    
}

 class example{
    public static void main(String[] args) {
        box smallBox=new box();
        smallBox.setDimension(10, 20, 30);
        smallBox.showDimension();
    }
}