import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int num=sc.nextInt();
        int count=0;
        if(num>1){
            for (int i = 2; i <num/2; i++) {
                if(num%i==0){
                   count=1;
                }
            }if(count==1){
            System.out.println("not a prime number");
        }
        else{
            System.out.println("it is a prime number");
        }
        }
        else{
            System.out.println("number is not prime");
        }
    }
}
