import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str=sc.nextLine();
        //String rev="";
        //using our approach
       /* for (int i = str.length()-1; i>=0; i--) {
            rev=rev+str.charAt(i);
        }*/ 


        // using chararray 
       /* char a[]=str.toCharArray();
        for (int i = a.length-1; i>=0; i--) {
            rev=rev+a[i];
        }*/

        //using StringBuffer
        StringBuffer sb= new StringBuffer(str);
        StringBuffer rev=sb.reverse();
        
        System.out.println("Reverse String is "+rev);
    }
}
