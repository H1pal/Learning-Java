package test01.practicing;

/*

문제

(중첩된 for문 활용)
1부터 20까지의 숫자를 다음과 같은 형태로
출력하세요.
1 2 3 4 5
10 9 8 7 6
11 12 13 14 15
20 19 18 17 16

실행 화면 예시

1 2 3 4 5
10 9 8 7 6
11 12 13 14 15
20 19 18 17 16

*/

public class problem08 {
    public static void main(String[] args) {
        int num = 1;
        int[][] arr = new int[4][5];

        for (int i = 0;i < arr.length;i++) {
            if (i % 2 == 1) {
                for (int j = 0;j < 5;j++) {
                    arr[i][4 - j] = num++;
                }
            }
            else {
                for (int j = 0;j < 5;j++) {
                    arr[i][j] = num++;
                }
            }
        }

        for (int[] i : arr) {
            for (int j : i) System.out.print(j + " ");
            System.out.println();
        }
    }
}
