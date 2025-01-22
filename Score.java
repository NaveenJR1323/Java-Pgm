import java.util.Scanner;

public class Score {

    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=s.nextLine();
        System.out.print("Enter your Score:");
        double score=s.nextDouble();
        System.out.print("Enter your department:");
        s.nextLine();
        String department=s.nextLine();
        System.out.println("My name is " +name);
        System.out.println("My Score is " +(score/10)+"/10");
        System.out.print("My department is " +department);

    }
    
}
