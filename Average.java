import java.util.Scanner;
public class Average {

    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        System.out.print("Enter mark of A:");
        int a=s.nextInt();
        System.out.print("Enter mark of B:");
        int b=s.nextInt();
        System.out.print("Enter mark of C:");
        int c=s.nextInt();
        System.out.print("Enter mark of D:");
        int d=s.nextInt();
        System.out.print("Enter mark of E:");
        int e=s.nextInt();
        int total=a+b+c+d+e;
        System.out.println("Total:"+total);
        double average=total/5;
        System.out.println("Average Mark:"+average);

        if(average<35){

            System.out.print("Additional Class is Required");
        }
        else{

            System.out.print("You're good to go");
        }
    } 
    
}
