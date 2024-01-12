import java.util.Scanner;

public class array1d {
    public static void main(String[] args) {
        int []arr;
        arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the array : ");
        for(int i=0; i<5; i++){
              arr[i]=sc.nextInt();
        }
        System.out.println("This is our array : ");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
            
        }
        sc.close();

    }
}
