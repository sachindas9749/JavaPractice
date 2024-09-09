import java.util.Arrays;

public class PracticeQ {
    public static void main(String[] args) {
        int []arr={2,4,6,7,8,9,12};
        int d=4;
        int q=2;
        int r=1;
        int index=dividentCheker(arr,d,q,r);
        //System.out.println(index);
        int numberOfCandy=5;
        int []priceOfCandies = {10,12,7,4,9};
        int money=20;
        int result=numberOfCandyBought(priceOfCandies,numberOfCandy,money);
        System.out.println(result);
    }
    public static int dividentCheker(int []arr,int d,int q,int r){
        int divident = d*q+r;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==divident){
                return i;
            }
        }
        return -1;
    }
    public static int numberOfCandyBought(int []priceOfCandies,int numberOfCandy,int money){
        int count=0;
        Arrays.sort(priceOfCandies);
        for (int i : priceOfCandies) {
            if(i%5==0){
                count++;
            }
            else{
                if(money>=i){
                money=money-i;
                count++;
            }
            }
        }
        return count;
    }
}
