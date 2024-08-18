import java.util.Scanner;

public class BmiCalculate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your weight in kg :- ");
        int weight=sc.nextInt();
        System.out.println("Enter height in meter ");
        float height=sc.nextFloat();
        float result= bmi(weight,height);
        if (result<18) {
            System.out.println(0);
        }
        else if(result>=18 && result<25){
            System.out.println(1);
        }
        else if(result>=25 && result<30){
            System.out.println(2);
        }
        else if(result>=30 && result<40){
            System.out.println(3);
        }
        else{
            System.out.println(4);
        }
    }
    public static float bmi(int weight,float height){
        float bmi= weight/(height*height);
        return bmi;
    }
}
