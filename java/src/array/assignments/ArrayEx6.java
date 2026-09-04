package array.assignments;

/*
- 클래스 이름: ArrayEx6

- int[][] score = new int[][]{{89, 76, 100, 68, 48, 98, 56, 77, 95}, {50, 60, 70,
100, 99, 88, 83, 78, 93}};
- 2차원 배열에서 첫번째 행이 A반, 두번째 행이 B반의 점수이다.
- 중첩 for문을 사용하여 arr의 합을 구하기
- 평균을 구하여 출력하기(평균은 소수점 첫번째 자리까지)

실행
결과

A반 평균: 78.6
B반 평균: 80.1
* */

public class ArrayEx6 {
    public static void main(String[] args) {
        int[][] score = new int[][]{
                {89, 76, 100, 68, 48, 98, 56, 77, 95},
                {50, 60, 70, 100, 99, 88, 83, 78, 93}
        };
        double avgA = 0;
        double avgB = 0;

        for (int j = 0;j < score[0].length;j++) {
            avgA += score[0][j];
        }
        avgA /= score[0].length;

        for (int j = 0;j < score[1].length;j++) {
            avgB += score[1][j];
        }
        avgB /= score[1].length;

        System.out.printf("A반 평균: %.1f\n", avgA);
        System.out.printf("B반 평균: %.1f", avgB);
    }
}
