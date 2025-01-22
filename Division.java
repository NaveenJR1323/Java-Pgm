import java.util.Scanner;
public class Division {

    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=s.nextInt();
        if(a%3==0 && a%5==0){
            System.out.print("The number is divisible by 3 & 5");
        }
        else{
            System.out.print("The number is not divisible by 3 & 5");
        }
    }
    
}
