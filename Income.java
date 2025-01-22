import java.util.Scanner;
public class Income {

    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        System.out.print("Enter your Income:");
        int income=s.nextInt();
        if(income>=7000){

            System.out.print("Scholarship is Available");
        }
        else{

            System.out.print("Not Available");
        }


    }
    
}
