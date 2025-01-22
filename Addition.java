import java.util.Scanner;
public class Addition {

    void add()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter A:");
        int a=s.nextInt();
        System.out.print("Enter B:");
        int b=s.nextInt();
        int c=a+b;
        System.out.print("The sum is:"+c);
    }

    public static void main(String args[]){

          Addition sum=new Addition();
          sum.add();
    }
    
}
