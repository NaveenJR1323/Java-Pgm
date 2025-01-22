import java.util.Scanner;

public class Check {

    public static void main(String args[]){

       Scanner s=new Scanner(System.in);

       System.out.print("Enter a number:");
       int a=s.nextInt();

       System.out.print("Enter a number:");
       int b=s.nextInt();
       if(a==b){

        System.out.print("Yes,it is equal");
       }
       else{
        System.out.print("NO,not equal");
       }
    }
    
}
