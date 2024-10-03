import java.util.Arrays;

public class AllString {
    public static void main(String[] args) {
        
    }
     public boolean isAnagram(String s, String t) {
        char []arr1 = s.toCharArray();
        char []arr2 = t.toCharArray();
        if(s.length()!= t.length()){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
  }
}
