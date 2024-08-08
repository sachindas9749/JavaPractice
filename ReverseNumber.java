import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        /*int rev=0;
        while (a!=0) {
            rev=rev*10+(a%10);
            a=a/10;
        }*/
        //using string buffer class
       /* StringBuffer sb=new StringBuffer(String.valueOf(a));
         StringBuffer rev=sb.reverse();*/
         //using string builder class


         StringBuilder sb = new StringBuilder();
         sb.append(a);
         StringBuilder rev=sb.reverse();
        System.out.println("Reverse Number is "+rev);
    }
}
