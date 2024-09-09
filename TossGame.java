public class TossGame {
    public static void main(String[] args) {
        String s= "HTHHTTHTHHHT";
        int score=0,headCount=0;
        for (int i = 0; i <s.length(); i++) {
            if(headCount>=3){
                break;
            }
            if(s.charAt(i)=='H'){
                headCount++;
                score+=2;
            }
            else{
                score-=1;
                headCount=0;
            }
        }
        System.out.println(score);
    }
}
