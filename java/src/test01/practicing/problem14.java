package test01.practicing;

/*

문제
(for문과 if문의 활용)
1에서 100까지 정수 중에서 3의 배수인 수만 더한
결과를 출력하세요.

실행 화면 예시

1683

*/

public class problem14 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 3;i < 100;i+=3) {
            sum += i;
        }

        System.out.println(sum);
    }
}
