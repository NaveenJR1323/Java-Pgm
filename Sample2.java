import java.util.Scanner;


public class Sample2 {

    public static void main(String args[]){

        Scanner n=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=n.nextInt();
        System.out.print("Enter b:");
        int b=n.nextInt();
        System.out.print("Enter c:");
        int c=n.nextInt();
        int d= a*b*c;
        int e=a+b+c;
        System.out.print("Result:"+(d/e));
    }
    
}
