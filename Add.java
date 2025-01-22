import java.util.Scanner;

class Add{

    public static void main(String[] args) {
    
        System.out.print("Enter a number:");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.print("Enter a number:");
        int b=s.nextInt();
        System.out.println("Sum of two numbers is:"+(a+b));
    }

}
