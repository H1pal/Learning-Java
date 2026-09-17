package test01.practicing;

/*

문제
(배열, for문, if문 활용)
배열에 저장된 값 중에서 짝수만 찾아 가장 큰 값을
출력하세요.

실행 화면 예시

짝수 중 가장 큰 값: 92

*/

public class problem07 {
    public static void main(String[] args) {
        int[] numbers = {13, 66, 34, 83, 41, 92, 23, 76};
        int max = 0;
        for (int i : numbers) {
            if (i % 2 == 0 && i > max) max = i;
        }
        System.out.println("짝수 중 가장 큰 값: " + max);
    }
}
