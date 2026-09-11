package test01;

/* ex15

(중첩 for문)
다음과 같이 출력하세요.
10
9 8
7 6 5
4 3 2 1

*/

public class Ex15 {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 0;i < 4;i++) {
            for (int j = 0;j < i+1;j++) {
                System.out.print(num-- + " ");
            }
            System.out.println();
        }
    }
}
