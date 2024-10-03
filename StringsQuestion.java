public class StringsQuestion {
    public static void main(String[] args) {
        String s= "Take  you Forward?";
        String updated = s.replaceAll("[ !@#$&?]", "");
        System.out.println(updated);
        /*if(isPalindrome(s)){
            System.out.println("true");
        } 
        else{
            System.out.println("false");
        }*/

    }
    public static boolean isPalindrome(String s){
        String rev="";
        for (int i = s.toCharArray().length-1; i >=0; i--) {
            rev+=s.charAt(i);
        }
        if(rev.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
}
