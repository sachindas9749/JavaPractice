public class ValidParenthisis {
    public static void main(String[] args) 
    {
        String s="sachin";
        System.out.println(checkValidParenthisis(s, 0, 0));
        int st=0;
        char [] str=s.toCharArray();
        int end=str.length-1;
        while (st<end) {
            char c =str[st];
            str[st]=str[end];
            str[end]=c;
            st++;
            end--;
        }
        System.out.println(new String(str));
    }
    static boolean checkValidParenthisis(String s,int index,int count){
        if(index>s.length()-1){
            if (count==0) {
                return true;
            }
            return false;
        }
        if(s.charAt(index)=='('){
            count++;
        }
        else if(s.charAt(index)==')'){
            if(count<=0){
                return false;
            }
            count--;
        }
        else{
            
        }
        return checkValidParenthisis(s, index+1, count);
    }
}
