import java.util.Scanner;
public class Evenodd {

    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=s.nextInt();
        if(a%2==0){

            System.out.print("Even");
        }
        else{

            System.out.print("Odd");
        }
    }
    
}
