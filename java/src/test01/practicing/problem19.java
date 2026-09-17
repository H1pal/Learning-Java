package test01.practicing;

/*

문제
(비트 연산자의 활용)
비트 이동(shift) 연산자를 사용하여 n의 값을 4로
나눈 결과를 출력하세요.

실행 화면 예시

32

*/

public class problem19 {
    public static void main(String[] args) {
        int n = 128;
        n >>= 2;
        System.out.println(n);
    }
}
