package test01.practicing;

/*

문제

(for문, if문 활용)
10부터 50까지의 정수 중 3의 배수이면서 5의
배수가 아닌 수의 합을 구하세요.

실행 화면 예시

합계: 300

*/

public class problem04 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 != 0) sum += i;
        }
        System.out.println("합계: " + sum);
    }
}
