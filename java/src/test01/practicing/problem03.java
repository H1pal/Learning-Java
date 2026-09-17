package test01.practicing;

/*

문제

(for문 활용)
7부터 55까지 3씩 증가하는 수의 합을 구하세요.
7 + 10 + 13 + ... + 55 = 527

실행 화면 예시

7부터 55까지 3씩 증가하는 수의 합: 527

*/

public class problem03 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 7; i <= 55; i += 3) {
            sum += i;
        }
        System.out.println("7부터 55까지 3씩 증가하는 수의 합: " + sum);
    }
}
