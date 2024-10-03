import java.util.HashMap;
import java.util.Scanner;

public class PracticeTCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter a Number : -");
        int num = sc. nextInt();
        System.out.println(binaryNumber(num));*/
        //primeNumber(10,20);
       // palindromeNumber(100, 150);
       //armstrongNumberRange(150,500);
        int []arr={10,15,10,15,2,1};
        HashMap<Integer,Integer> hs = new HashMap<>();
        for (int i : arr) {
            if(hs.containsKey(i)){
                hs.put(i,hs.get(i)+1);
            }
            else{
                hs.put(i,1);
            }
        }
        System.out.println(hs);
    }
    public static int reverseNumber(int num){
        int revese=0,rem=0;
        while (num!=0) {
            rem=num%10;
            revese=revese*10+rem;
            num=num/10;
        }
        return revese;
    }
    public static int DecimalNumber(int num){
        int decimal=0,count=0,rem=0;
        while (num!=0) {
            rem=num%10;
            decimal+=(rem*(1<<count));
            num=num/10;
            count++;
        }
        return decimal;
    }
    public static int binaryNumber(int num){
        int binary=0,rem=0,placeValue=1;
        while (num!=0) {
            rem=num%2;
            binary+=(rem*placeValue);
            num=num/2;
            placeValue*=10;
        }
        return binary;
}
public static void primeNumber(int r1,int r2){  
    System.out.println("Prime Number in the given range are : ");
    for (int i = r1; i <=r2; i++) {
        boolean isPrime=true;
        for (int j = 2; j <Math.sqrt(i); j++) {
            if(i%j==0){
                isPrime=false;
            }
        }
        if(isPrime){
        System.out.println(i);
        }
    }
}
public static void palindromeNumber(int r1,int r2){
    for (int i = r1; i <=r2; i++) {
        int rev = reverseNumber(i);
        if (i==rev) {
            System.out.println(i);
        }
    }
}
public static void armstrongNumber(int num){
    int numberOfDigits= String.valueOf(num).length();
    int sum =0,original=num;
    while (num!=0) {
        int rem= num%10;
        sum+=Math.pow(rem, numberOfDigits);
        num=num/10;
    }
    if(sum==original){
        System.out.println(original+" Armstrong Number");
    }
    else{
       // System.out.println("Not a Armstrong Number");
    }

}
public static void armstrongNumberRange(int r1,int r2){
    for (int i = r1; i <=r2; i++) {
        armstrongNumber(i);
    }
}

}

