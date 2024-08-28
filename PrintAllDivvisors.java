import java.util.*;
public class PrintAllDivvisors {
    public static void main(String[] args) {
        int n=5;
        int count=0;
        ArrayList a= new ArrayList<>();
        for (int i = 1; i*i <=n; i++) {
            if(n%i==0){
                a.add(i);
                a.add(n/i);
            }
        }
        for (Object object : a) {
            System.out.println(object);
        }
        for (int j = 1; j*j <=n; j++) {
            if(n%j==0){
                count++;
                if(n%(n/j)==0){
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }

    }
}
