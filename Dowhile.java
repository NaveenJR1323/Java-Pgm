import java.util.Scanner;
public class Dowhile {

    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        int a=0;
        

        do{

            System.out.println("Enter the number>10:");
            a=s.nextInt();
        }

        while(a<10);

    }
    
}
