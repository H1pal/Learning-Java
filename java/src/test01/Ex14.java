package test01;

/* ex14

(중첩 for문 활용)
다음과 같이 출력하세요.
54321
4321
321
21
1

*/

public class Ex14 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0;i < num;i++) {
            for (int j = num-i;j > 0;j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
