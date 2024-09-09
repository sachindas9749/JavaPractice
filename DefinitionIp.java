public class DefinitionIp {
    public static void main(String[] args) {
        String s= "1.1.1.1";
        char [] str = s.toCharArray();
        StringBuilder ans = new StringBuilder();
       for (int index = 0; index < str.length; index++) {
        if(str[index]=='.'){
            ans.append("[.]");

        }
        else{
        ans.append(str[index]);
       }
    }
       System.out.println(new String(ans));
    }
}
