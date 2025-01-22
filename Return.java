public class Return {

    String getname()
    {
          return "Naveen";
    }

    long getphone()
    {
        return 902576649;       
    }

    String getaddress()
    {
        return  "Chennai";
    }

    public static void main(String args[]){

        Return a=new Return();
        String name=a.getname();
        long num=a.getphone();
        String place=a.getaddress();
        System.out.println(name);
        System.out.println(num);
        System.out.println(place);

      
    }
    
}
