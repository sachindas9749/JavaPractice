import java.util.Scanner;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int count=1;
        char []ch =s.toCharArray();
        for( int i=0;i<ch.length;i++){
            if(ch[i]==ch[i+1]){
             break;
            }
            else{
                count++;
            }
        }
        return count;  
         }
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String :- ");
            String s= sc.next();
            int c=lengthOfLongestSubstring(s);
            System.out.println(c);
         }
} 
