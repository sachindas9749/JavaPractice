import java.util.Scanner;

public class StringPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        String rev= reverse(str);
        System.out.println(rev);
        Boolean a= isPalindromeOrNot(str, rev);
        System.out.println(a);
        if(isPalindromeOrNot(str,rev)){
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static String reverse(String str){
        String rev="";
        for (int i = str.length()-1; i >=0; i--) {
            rev=rev+str.charAt(i);
        }
        return rev;
    }
    public static boolean isPalindromeOrNot(String str, String rev){
        if (str.equals(rev)) {
            return true;
        }
        else{
            return false;
        }
    }
}
