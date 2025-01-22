import java.util.Scanner;
public class School {

    void passorfail(int total)
    {
        if(total>=35){
            System.out.println("You're Pass");
        }
        else{
            System.out.print("You're Fail");
        }
    }

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your score:");
        int score=s.nextInt();
        School obj=new School();
        obj.passorfail(score);
    }
    
}
