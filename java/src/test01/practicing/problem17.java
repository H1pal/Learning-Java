package test01.practicing;

/*

문제

(배열, for문 활용)
다음은 A반 학생들의 성적이다. 과목별 평균을
구하여 출력하세요.

실행 화면 예시

국어: 72.4
영어: 88.6
수학: 90.4

*/

public class problem17 {
    public static void main(String[] args) {
        int[][] score = {
                {80, 90, 100},
                {74, 100, 88},
                {65, 77, 90},
                {45, 76, 82},
                {98, 100, 92}
        };
        String[] subName = {"국어", "영어", "수학"};

        int students = score.length;
        for (int i = 0; i < subName.length; i++) {
            double avgBySubject = 0;
            for (int j = 0; j < students; j++) {
                avgBySubject += score[j][i];
            }
            avgBySubject /= students;
            System.out.printf("%s: %.1f\n", subName[i], avgBySubject);
        }
    }
}
