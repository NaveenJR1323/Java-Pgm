import java.util.Scanner;

public class Prediction {

    public static void main(String args[]){

        // String RCB="Win";

        Scanner s=new Scanner(System.in);

        String RCB=s.nextLine();

        if(RCB.equals("Win")){

            System.out.print("Ee Saala Cup Namadhe");
        }
        else{
            System.out.print("Cup illa");
        }
    }
    
}
