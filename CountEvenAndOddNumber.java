import java.util.Scanner;

public class CountEvenAndOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num= sc.nextInt();
        int a;
        int evencount=0,oddcount=0;
        while (num>0) {
            a=num%10;
            if(a%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
            num=num/10;
        }
        System.out.println(evencount+"    "+oddcount);
    }
}
