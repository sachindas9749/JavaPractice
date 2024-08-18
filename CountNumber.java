import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the starting range:- ");
        int st = sc.nextInt();
        System.out.println("Enter the ending range:- ");
        int end = sc.nextInt();
        System.out.println("Enter the number which you want to see how many time occur in that range :- ");
        int num = sc.nextInt();
        int result = countNumber(st, end, num);
        System.out.println(result);
    }
    public static int countNumber(int st,int end,int num){
        int count=0,rem;
        if(st>end){
            return -1;
        }
        else{
            for (int i = st; i <=end; i++) {
                int temp=i;
                while (temp!=0) {
                    rem=temp%10;
                    if(num==rem){
                        count++;
                    }
                    temp=temp/10;
                }
        }
    }
    return count;
}
}
