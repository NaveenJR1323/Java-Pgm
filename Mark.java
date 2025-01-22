import java.util.Scanner;
public class Mark {

    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        System.out.print("Enter your mark:");

        int mark=s.nextInt();
        if(mark>=35){

            System.out.print("You're pass");
        }
        else{

            System.out.print("You're fail");
        }

    }
    
}
