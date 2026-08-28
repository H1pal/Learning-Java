package loop;

public class BreakEx1 {
    public static void main(String[] args) {
        // 0부터 시작해서 1씩 늘어나 숫자의 합이 100을 초과하는 경우 해당 수의 합을 구하기
        int i = 1;
        int sum = 0;

        for (;;i++) {
            sum += i;
            if (sum > 100) break;
        }
        System.out.printf("i: %d\nsum: %d", i, sum);
    }
}
