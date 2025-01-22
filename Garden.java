import java.util.Scanner;

public class Garden {

    void apple(){

        Scanner s=new Scanner(System.in);
        System.out.print("Enter apple price:");
        int a=s.nextInt();
        System.out.print("Enter apple count:");
        int b=s.nextInt();
        int c=a*b;
        System.out.print("The total amount is "+c);

    }
    public static void  main(String args[]){

        Garden app=new Garden();
        app.apple();

    }
    
}
