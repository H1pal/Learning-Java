package test01.practicing;

/*

문제

(if문 활용)
세 정수 중에서 가장 큰 수를 찾아 출력하세요.

실행 화면 예시

가장 큰 수는 99

*/

public class problem18 {
    public static void main(String[] args) {
        int num1 = 80;
        int num2 = 99;
        int num3 = 77;
        int max;
        if (num1 > num2 && num1 > num3) max = num1;
        else if (num2 > num3 && num2 > num1) max = num2;
        else max = num3;

        System.out.println("가장 큰 수는: "+  max);
    }
}
