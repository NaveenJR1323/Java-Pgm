    import java.util.Scanner;
    public class Loan {

        public static void main(String args[]){

            Scanner s=new Scanner(System.in);
            System.out.print("Enter your Salary:");
            int salary=s.nextInt();
            System.out.print("Enter your Age:");
            int age=s.nextInt();
        

            if(salary>=20000 || age<=25){

                    System.out.println("You're eligible for Loan");
                    System.out.print("Enter your Loan:");
                    int loan=s.nextInt();

                    if(loan<=50000){

                        System.out.print("Youre will be Sanctioned");

                    }

                    else{

                        System.out.print("Maximum loan amount is 50000");
                    }
            }
        
            else{

                System.out.print("You're not eligible");
            }
        }
        
    }
