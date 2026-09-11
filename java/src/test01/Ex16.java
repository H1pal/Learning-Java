package test01;

/* ex16

(중첩 for문과 if문 활용)
두 주사위를 굴렸을 때 합이 8인 경우를 찾아 출력하세요.

*/

public class Ex16 {
    public static void main(String[] args) {
        for (int i = 0;i <= 6;i++) {
            for (int j = 0;j <= 6;j++) {
                if (i + j == 8) System.out.printf("%d+%d=%d\n", i, j, i+j);
            }
        }
    }
}
