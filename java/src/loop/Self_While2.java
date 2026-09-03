package loop;

public class Self_While2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 10) {
            sum += i++;
        }
        System.out.printf("1~10까지 정수의 합은 %d이다.", sum);
    }
}
