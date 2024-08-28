public class FactorialUsinRecursion {
    public static void main(String[] args) {
        int num= 5;
        int fact =factorial(num);
        System.out.println(fact);
    }
    public static int factorial(int num){
        return num*factorial(num-1);
    }
}
