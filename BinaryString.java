public class BinaryString {
    public static void main(String[] args) {
        String s= "1111011010111";
        int count=0;
        char word='A';
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1'){
                count++;
            }
            if( count>=1 && s.charAt(i)=='0'){
                word+=(count-1);
               result.append(word);
                count=0;
                word='A';
            }
        }
        if(count>=1){
            word+=(count-1);
            result.append(word);
        }
        System.out.println(result);
    }
}
