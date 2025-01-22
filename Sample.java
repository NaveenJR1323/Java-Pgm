import java.util.Scanner;
public class Sample {

    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        int age=s.nextInt();
        s.nextLine();
        String address=s.nextLine();
        System.out.println("My name is:"+name);
        System.out.println("My age is:"+age);
        System.out.print("My address is:"+address);


    }
    
}
