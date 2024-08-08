import java.util.Scanner;
public class First{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int m= sc.nextInt();
	System.out.println(defDifference(m,n));
}
public static int defDifference(int m,int n){
  int sum1=0, sum2=0,diff;
	for(int i=1;i<=m;i++){
	
	if(i%n!=0){
	sum2=sum2+i;
	}
	else{
	sum1=sum1+i;
	} 
}
	diff= Math.abs(sum2-sum1);
return diff;
}
}