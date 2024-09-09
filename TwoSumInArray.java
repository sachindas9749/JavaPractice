import java.util.HashMap;

public class TwoSumInArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int K=11;
       /*  for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==K){
                    System.out.println("Index are "+i+" "+j);
                    return;
                }
            }
        }*/
        // Using hashing
        HashMap<Integer,Integer> nums = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int cur=arr[i];
            if(nums.containsKey(K-cur))
            {
                System.out.println("Index are "+i+" "+nums.get(K-cur));
                return;
            }
            nums.put(arr[i], i);
        }
    }
}
