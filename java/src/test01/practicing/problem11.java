package test01.practicing;

/*

문제

(자료형 활용)
반지름이 12인 원의 넓이를 구하세요.
원주율은 상수형 변수를 선언하고 3.14 값을
저장하여 계산하세요.

실행 화면 예시
반지름이 12인 원의 넓이는 452.16

*/

public class problem11 {
    public static void main(String[] args) {
        int radius = 12;
        double PI = 3.14;
        double nearbyOfCircle = radius * radius * PI;
        System.out.printf("반지름이 %d인 원의 넓이는 %.2f", radius, nearbyOfCircle);
    }
}
