import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = sc.next();
        String remString = removeVowels(str);
        System.out.println(remString);
    }
    static String removeVowels(String str){
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
