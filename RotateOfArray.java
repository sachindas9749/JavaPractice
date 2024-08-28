public class RotateOfArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int []leftArr = optimalRightRotate(arr,2);
        for (int j = 0; j < leftArr.length; j++) {
            System.out.println(leftArr[j]);
        }
    }
    static int [] rotateArray(int []arr){
        int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
            if(i==arr.length-1){
                arr[i]=temp;
            }
        }
        return arr;
    }
    //Bruteforce Approach
    static int [] rotateKPlaces(int []arr,int k){
        int n= arr.length-1;
        int []temp=new int[k];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=arr[i];
        }
        for (int j=k; j <n; j++) {
            arr[j-k]=arr[j];
        }
        for (int i = n-k; i <n; i++) {
            arr[i]=temp[i-(n-k)];
        }
        return arr;
    }
    //Optimal Approach
    static int [] optimalRotate(int []arr,int k){
        int n = arr.length-1;
        reverse(arr,0,k-1);
        reverse(arr,k,n);
        return reverse(arr,0,n);
    }
    static int []reverse(int[]arr,int st,int end){
       while (st<=end) {
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
        st++;
        end--;
       }
       return arr;
    }
    static int []rightRotateArray(int []arr, int k){
        int n = arr.length;

        // Handle cases where k is greater than n
        k = k % n; // Rotation by n or multiples of n results in the same array
    
        // Step 1: Create a temporary array to store the last k elements
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i]; // Store the last k elements in temp
        }
    
        // Step 2: Shift the rest of the array to the right by k positions
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
    
        // Step 3: Copy the elements from temp to the beginning of the array
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    
        return arr;
    }
    static int [] optimalRightRotate(int []arr,int k){
        int n = arr.length-1;
        reverse(arr,0,n-k);
        reverse(arr,n-k+1,n);
        return reverse(arr,0,n);
    }
}
