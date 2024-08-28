import java.util.Scanner;

public class LargestElementInTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size of thge array:- ");
        int n= sc.nextInt();
        System.out.println("Enter the elements: -");
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int largest = largest(arr);
        System.out.println(largest);
    }
    static int largest(int []arr){
        int max= arr[0];
        int secondmax=Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>secondmax){
                secondmax=arr[i];
            }
        }
        return secondmax;
    }
    static int larger(int[]arr,int i,int max){
        if(i>=arr.length-1){
            return max;
        }
        if(arr[i]>max){
            max=arr[i];
        }
       return larger(arr, i+1, max);
    }
}
