package test01.practicing;

/*

문제

(배열, for문 활용)
90점 이상을 받은 학생이 몇 명인지 출력하세요.

실행 화면 예시
점수가 90점 이상인 학생은 3명입니다.

*/

public class problem21 {
    public static void main(String[] args) {
        int[] score = {78, 95, 64, 88, 100, 73, 82, 59, 91, 67};
        int count = 0;
        for (int i : score) {
            if (i >= 90) count++;
        }
        System.out.printf("점수가 90점 이상인 학생은 %d명입니다.", count);
    }
}
