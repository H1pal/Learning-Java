package loop;

public class Self_While3 {
    public static void main(String[] args) {
        int oddSum = 0;
        int evenSum = 0;
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) evenSum += i++;
            else oddSum += i++;
        }
        System.out.printf("1~10까지의 짝수의 합은 %d이고, 홀수의 합은 %d이다.", evenSum, oddSum);
    }
}
