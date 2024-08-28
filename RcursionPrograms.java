public class RcursionPrograms {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        String s= "Madam";
        s= s.replaceAll(s, s);
        reverseArray(0,arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(palindrome(s, 0));
    }
    static void reverseArray(int a,int []arr){
            if(a>=(arr.length/2)){
                return;
            }
            int temp=arr[a];
            arr[a]=arr[arr.length-1-a];
            arr[arr.length-a-1]=temp;
            reverseArray(a+1, arr);
        }
        static boolean palindrome(String s,int i){
            char []ch= s.toCharArray();
            if(i>=s.length())
                return true;
            if(ch[i]!=ch[ch.length-1-i]){
                return false;
            }
           return palindrome(s, i+1);
            
        }
    }