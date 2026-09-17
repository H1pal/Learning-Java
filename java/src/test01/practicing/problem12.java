package test01.practicing;

/*

문제

(자료형 활용)
화씨 온도(F)를 섭씨 온도(C)로 변환하는 식은
다음과 같다.
C = (F -32) * 5/9
화씨 온도가 100도일 경우, 섭씨 온도를 계산하여
소수점 첫번째 자리까지 출력하세요.

실행 화면 예시
화씨 온도 100도의 섭씨 온도는 37.8

*/

public class problem12 {
    public static void main(String[] args) {
        int dgf = 100;
        double dgc = (dgf - 32) * 5/9.0;
        System.out.printf("화씨 온도 %d도의 섭씨 온도는 %.1f", dgf, dgc);
    }
}
