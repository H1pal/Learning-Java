package loop;

public class Self_For1 {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) sumOdd += i;
            else sumEven += i;
        }
        System.out.printf("1~10까지의 짝수의 합은 %d이고, 홀수의 합은 %d이다.", sumEven, sumOdd);
    }
}
