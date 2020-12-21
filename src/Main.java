public class Main {
    public static void main(String[] args) {
        int put = 100;
        int bonus;
         if(put >= 1_000){
            bonus = (put/100);
        } else{
            bonus = 0;
        }
        int balance = 100;
        int score = balance + put + bonus;
        System.out.println(score);
    }

}
