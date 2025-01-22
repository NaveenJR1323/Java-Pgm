import java.util.Scanner;
class Middle{

    public static void main(String args[]){

        Scanner n=new Scanner(System.in);
        
        System.out.print("Enter the size of an Array:");
        int size=n.nextInt();
        int[] one=new int[size];
        for(int i=0;i<size;i++){
            
            System.out.print("Enter a number:");
            one[i]=n.nextInt();
        }

        System.out.println("Middle element is:"+(one[size/2]));
    }
}