package test01.practicing;

/*

문제

(중첩 for문 활용)
다음과 같이 for문을 사용하여 출력하세요.

실행 화면 예시

    *
   **
  ***
 ****
*****

*/

public class problem20 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0;i < num;i++) {
            for (int j = 0;j < num-i-1;j++) {
                System.out.print(" ");
            }
            for (int j = 0;j < i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
