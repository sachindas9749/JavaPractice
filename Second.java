import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println(defLargeSmallSum(arr));
    }
    public static int defLargeSmallSum(int []arr){
        int oddhigh=0,evenhigh=0;
        int n= 5;
        for (int i = 0; i <arr.length; i++) {
            if(i%2!=0){
                Arrays.sort(arr);
                oddhigh=arr[n-2];}
            else{
                Arrays.sort(arr);
                evenhigh=arr[n-2];
            }
        }
        return evenhigh+oddhigh;
    }
}
