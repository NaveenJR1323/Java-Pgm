import java.util.Scanner;
public class Game {

    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        System.out.print("Enter your Score:");
        int score=s.nextInt();

        if(score<50){

            System.out.print("You need to improve");
        }
        else if(score>=50 && score<=70){

            System.out.print("Good Job");
        }
        else if(score>70){

            System.out.print("Excellent Performace");
        }
    }
    
}
