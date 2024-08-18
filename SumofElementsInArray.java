import java.util.Scanner;

public class SumofElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element you want to insert in the array:-");
        int n=sc.nextInt();
        int []arr= new int[n];
        System.out.println("Enter the elements:- ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int sum=sumOfArray(arr);
        System.out.println(sum);
        int []a=oddArray(arr);
        display(a);
        int []b =evenArray(arr);
        display(b);
    }
    public static int sumOfArray(int []arr){
        int sum=0;
        for (int i : arr) {
            sum=sum+i;
        }
        return sum;
    }
    public static int []oddArray(int []arr){
        
        int c=0,odde=0;
        for (int i : arr) {
            if(i%2!=0){
                c++;
            }
        }
        int []odd= new int[c];
        for (int j : arr) {
            if(j%2!=0){
                odd[odde++]=j;
            }
        }
        return odd;
    }
    public static void display(int []arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static int []evenArray(int []arr){
        int count=0,eve=0;
        for (int i : arr) {
            if(i%2==0){
                count++;
            }
        }
        int []even=new int[count];
        for (int j : arr) {
            if(j%2==0){
                even[eve++]=j;
            }
        }
        return even;
    }
    }
