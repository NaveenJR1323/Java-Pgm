import java.util.Scanner;
public class Color {

    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Color(Red/Yellow/Green):");
        String color=s.nextLine();

        if(color.equals("Red")){

            System.out.print("Stop");
        }
        else if(color.equals("Yellow")){

            System.out.print("Get Ready");
        }
        else if(color.equals("Green")){

            System.out.print("Go");
        }
    }
    
}
