package loop;

public class ForEx1 {
    public static void main(String[] args) {
        int sum = 0;

        // for (선언;조건;증감식) 구조
        for (int i = 1;i <= 10;i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
