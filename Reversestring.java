public class Reversestring {

    public static void main(String args[]){

        String str="Hi,Naveen";
        String reversed=reverseString(str);
        System.out.println("Original string:"+str);
        System.out.println("Reversed string:"+reversed);
}

 public static String reverseString(String str){

    char[] chars= str.toCharArray();
    int left=0;
    int right=chars.length-1;
    while(left<right){

        //swap the left most letter with the right most letter

        char temp=chars[left];
        chars[left]=chars[right];
        chars[right]=temp;

        //jump to next letter

        left++;

        //moves to the before letter
        right--;
    }

       //return the original string

       return new String(chars);
 }


    
}
