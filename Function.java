public class Function{

    void iphone(){

        System.out.println("This is Iphone");
    }

    void samsung(){
        System.out.println("This is Samsung");
    }

    void realme(){
        System.out.println("This is Realme");
    }

    void oppo(){
        System.out.println("This is Oppo");
    }

    public static void main(String args[]){

        Function mobile1=new Function();
        Function mobile2=new Function();
        Function mobile3=new Function();
        Function mobile4=new Function();

        mobile1.iphone();
        mobile2.samsung();
        mobile3.realme();
        mobile4.oppo();
}
}