public class GooglyPrime {
    public static void main(String[] args) {
        int num=43;
        int rem=0,sum=0;
        boolean flag=false;
        while (num!=0) {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        for (int i = 2; i < Math.sqrt(sum); i++) {
            if(sum%i!=0){
                flag=true;
            }
        }
        if(flag){
            System.out.println(" Googly prime");
        }
        else{
            System.out.println("Not Prime");
        }
        
    }
}
