import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number till you want to see fibonacci series: ");
        int num=sc.nextInt();
        int st=0,end=1,fnum;
        for (int i = 0; i < num; i++) {
            fnum=st+end;
            st=end;
            end=fnum;
            System.out.println(fnum);
        }
    }
}
