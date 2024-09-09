public class StringChange {
    public static void main(String[] args) {
        String s="apple";
        String replace=replaceCharacter(s, 'a', 'p');
        System.out.println(replace);
    }
    static String replaceCharacter(String s,char c1,char c2){
       String str="";
       for (char ch : s.toCharArray()) {
        if(ch==c1){
            str+=c2;
        }
        else if (ch==c2){
            str+=c1;
        }
        else{
            str+=ch;
        }
       }
       return str;
    }
}
