package test01;

/* ex20

이차원 배열 seats는 영화관에서 예매 상태를 나타냅니다.
1은 예매하지 않은 좌석이며, 0은 예매를 완료한 좌석입니다.
예매 가능한 좌석의 수를 출력허세요.

*/

public class Ex20 {
    public static void main(String[] args) {
        int seats[][] = {
                {1, 0, 0, 0, 1},
                {0, 1, 1, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 0, 0, 1, 0}
        };
        int count = 0;
        for (int[] seat : seats) {
            for (int i : seat) {
                if (i == 1) count++;
            }
        }
        System.out.printf("예매 가능한 좌석 수는 %d입니다.", count);
    }
}
