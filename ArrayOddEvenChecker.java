public class ArrayOddEvenChecker{
public static void main(String args[]){
 int [] arr = {1,2,3,4,5,6};
String str ="";
 for(int i :arr){
   if(i%2==0){
str=str+"even";

}
else{
str= str+"odd";
}
}
System.out.println(str);

}



}