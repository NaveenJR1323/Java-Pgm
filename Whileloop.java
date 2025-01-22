import java.util.Random;
public class Whileloop {

    public static void main(String args[]){

        Random s=new Random();
        int rand=0;
       

        while(rand!=5){

            rand=s.nextInt(10);
            System.out.println(rand);
        }
    }

    
}
