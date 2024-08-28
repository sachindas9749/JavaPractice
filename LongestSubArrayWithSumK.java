import java.util.HashMap;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int [] nums= {1,2,3,1,1,1,1,3,4,5};
        int len = subArraySumWithHashing(nums,3);
        System.out.println(len);
    }
    static int subArraywithSumK(int []arr,int k){
        int len=0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if(sum==k){
                    len=Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
    static int subArraySumWithHashing(int []arr,int k){
        HashMap<Integer,Integer> sumMap = new HashMap<>();
        int cur_sum=0,len=0;
        for (int i = 0; i < arr.length; i++) 
        {
            cur_sum+=arr[i];
              if(cur_sum==k)
              {
               len=i+1;
              }
              if(sumMap.containsKey(cur_sum-k))
              {
                 len=Math.max(len,i-sumMap.get(cur_sum-k));
              }
              if(!sumMap.containsKey(cur_sum))
              {
                sumMap.put(cur_sum,i);
              }
        }
        return len;

    }
    /// for positive numbers Optimal Solution  O(n) and O(1)
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the functio
        int cur_sum=0,len=0,left=0,right=0;
        while(right<A.length)
        {
            cur_sum+=A[right];
            while(cur_sum>K && left<=right){
                cur_sum-=A[left];
                left++;
            }
            if(cur_sum==K)
            {
                len=Math.max(len,right-left+1);
            }
            right++;
           
        }
        return len;
    }
}
