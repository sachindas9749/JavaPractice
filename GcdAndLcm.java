public class GcdAndLcm {
    public static void main(String[] args) {
        int a=5,b=10;
        int gcd=0,gcd1=0;
       for (int i = 1; i <=Math.min(a, b); i++) {
        if(a%i==0 && b%i==0){
            gcd=i;
        }
       }
       System.out.println(gcd);
       //Another method
       for (int j = Math.min(a, b); j>=1; j--) {
        if(a%j==0 && b%j==0){
            gcd1=j;
            break;
        }
       }
       System.out.println(gcd1);
       //Using Euclidian Method
       while (a>0 && b>0) {
        if (a>b) {
            a=a%b;
        }
        else{
            b=b%a;
        }
       }
       if(a==0){
        System.out.println(b);
       }
       System.out.println(a);

    }
}
