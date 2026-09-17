package test01.practicing;

/*

문제

(비트 연산자의 활용)
비트 이동(shift) 연산자를 사용하여 n의 값에 8을 곱한
결과를 출력하세요.

실행 화면 예시

80

*/

public class problem10 {
    public static void main(String[] args) {
        int n = 128;
        n <<= 3;
        System.out.println(n);
    }
}
