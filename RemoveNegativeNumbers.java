public class RemoveNegativeNumbers {
    public static void main(String[] args) {
        int []arr={1,-2,3,-4,5,6};
        int right=arr.length-1,left=0;
      /*   for (int i = 0; i < n; i++) {
            if(arr[i]>=0){
                arr[index++]=arr[i];
            }
            
        }
        while (index < arr.length) {
            arr[index++] = 0; // This is optional; you could leave it unchanged.
        }
        for (int j : arr) {
            System.out.println(j);
        }
        System.out.println(arr.length);
        int mid=arr.length/2;
        System.out.println(mid);*/
        while (left<right) {
            while(left<right && arr[left]>0){
                left++;
            }
            while (left<right && arr[right]<0) {
                right--;
            }
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
