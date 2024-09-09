public class LongestCommonSuffix {
    public static void main(String[] args) {
        String [] arr={"blunder","grinder","under"};
        String input="thunder";
        int msl=0;
        String ans="";
        for (String word : arr) {
            int csl=longestCommonSuffx(input,word);
            if(csl>msl || (csl==msl && word.length()<ans.length())){
                ans=word;
                msl=csl;
            }
            
        }
        if(!ans.isEmpty()){
            System.out.println("Maximum match suffix is  "+ans);
        }
        else{
            System.out.println("no string found that match the word");
        }
    }
    public static int longestCommonSuffx(String input,String word){
        char []ch1= input.toCharArray();
        char []ch2= word.toCharArray();
        int i= ch1.length-1;
        int j= ch2.length-1;
        int count=0;
        while(i>=0 && j>=0 && ch1[i]==ch2[j] ){
            i--;
            j--;
            count++;
        }
        return count;
    }
}
