package test01.practicing;

/*

문제

(배열, for문, if문 활용)
for문을 활용하여 배열의 인덱스가 짝수이면
(인덱스 + 1) * 2를, 인덱스가 홀수이면 (인덱스 +
2) * 3을 차례대로 저장한 후 배열의 모든 값을
순서대로 출력하세요.

실행 화면 예시

numbers 배열에 저장된 값: 2 9 6 15 10 21 14 27
18 33

*/

import java.util.Arrays;

public class problem05 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i % 2 == 0 ? (i + 1) * 2 : (i + 2) * 3;
        }

        System.out.print("numbers 배열에 저장된 값: ");
        for (int i : numbers) System.out.print(i + " ");
    }
}
