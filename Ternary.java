import java.util.Scanner;
class Ternary{

    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        System.out.print("Enter A:");
        int a=s.nextInt();
        System.out.print("Enter B:");
        int b=s.nextInt();

        String greater=(a>b)?"A is greater":"B is greater";
        System.out.print(greater);
    }
}