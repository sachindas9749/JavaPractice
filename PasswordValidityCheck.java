import java.util.Scanner;

public class PasswordValidityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Password :- ");
        String pass= sc.nextLine();
        boolean result = isValid(pass);
        if(result){
            System.out.println("Valid SPassword");
        }
        else{
            System.out.println("Invalid Password");
        }
    }
    public static boolean isValid(String str){
        if((str.length()<4)){
            return false;
        }
        boolean hasDigit = false;
        boolean hasUppercase = false;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
        }
        if (!hasDigit || !hasUppercase) {
            return false;
        }    
        if (Character.isDigit(str.charAt(0))) {
            return false;
        }
        
        return true;    
}
}
