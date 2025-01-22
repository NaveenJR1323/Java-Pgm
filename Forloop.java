import java.util.Scanner;
public class Forloop {

    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        System.out.print("Enter A:");
        int a=s.nextInt();
        System.out.print("Enter B:");
        int b=s.nextInt();

        for(int i=a;i<=b;i++){

            System.out.println(i);
        }
    }
    
}
