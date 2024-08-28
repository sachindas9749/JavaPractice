import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UnionOfArrays {
    public static void main(String[] args) {
        int arr1[]={1,1,2,3,4,5,6,};
        int arr2[]={2,3,4,5,6,7,7,8};
        HashSet<Integer> set = new HashSet<>();
        for (int element1 : arr1) {
            set.add(element1);
        }
        for (int element2 : arr2) {
            set.add(element2);
        }
        ArrayList<Integer> newArr = new ArrayList<>(set);
        Collections.sort(newArr);
        System.out.println("Union of the array is : - "+newArr);
    }
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        int i=0,j=0;
        ArrayList<Integer> arr = new ArrayList<>();
      while(i<n && j<m){
          if(arr1[i]<arr2[j])
          {
              if(arr.size()==0 || arr.get(arr.size()-1 )!= arr1[i])
              {
                  arr.add(arr1[i]);
              }
              i++;
          }
          else if(arr2[j]<arr1[i])
          {
              if(arr.size()==0 || arr.get(arr.size()-1) != arr2[j])
              {
                  arr.add(arr2[j]);
              }
              j++;
          }
          else
          {
              if(arr.size()==0 || arr.get(arr.size()-1 )!= arr1[i])
              {
                  arr.add(arr1[i]);
              }
              i++;
              j++;
          }
      }
      while(i<n)
      {
          if(arr.size()==0 || arr.get(arr.size()-1) != arr1[i])
              {
                  arr.add(arr1[i]);
              }
              i++;
      }
      while(j<m)
      {
           if(arr.size()==0 || arr.get(arr.size()-1) != arr2[j])
              {
                  arr.add(arr2[j]);
              }
              j++;
      }
      return arr;
    }
}
