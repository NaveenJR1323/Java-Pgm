import java.util.Scanner;
class Find{

    void evenorodd(int num)
    {

        if(num%2==0){

            System.out.println("The number is Even");
        }
        else{

            System.out.print("The number is odd");
        }
    }

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=s.nextInt();
        Find no=new Find();
        no.evenorodd(a);
    }
}