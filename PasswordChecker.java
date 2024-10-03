public class PasswordChecker {
    public static void main(String[] args) {
        String pass ="Sachin1234";
        char []ch = pass.toCharArray();
        if(ch.length<8){
            System.out.println("Password is not a valid password");
            return;
        }
        boolean hasLower=false;
        boolean hasUpper=false;
        boolean hasdigit=false;
        boolean hasSpecial=false;
        boolean hasSpace=false;

        for (char c : ch) {
        if(Character.isLowerCase(c)){
            hasLower=true;
        }
        if(Character.isUpperCase(c)){
            hasUpper=true;
        }
        if(Character.isDigit(c)){
            hasdigit=true;
        }
        if (Character.isWhitespace(c)) {
            hasSpace=true;
        }
        if (c=='@' ||c=='#' ||c=='$'|| c=='%'||c=='&') {
            hasSpecial=true;
        }
        }
        if(hasSpace){
            System.out.println("Password is not valid");
        }
        else if (hasLower && hasUpper && hasdigit && hasSpecial) {
            System.out.println("Password is valid");
        }
        else{
            System.out.println("Password is not valid");
        }
    }
}
