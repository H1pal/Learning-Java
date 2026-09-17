package test01.practicing;

/*

(switch case문 활용)
점수와 등급을 출력하세요.
등급은 score가 90점 이상이면 "등급: A", 80점
이상 90점 미만이면 "등급: B", 70점 이상 80점
미만이면 "등급: C", 70점 미만이면 "등급: D"를
출력하세요.

실행 화면 예시

점수: 86
등급: B
*/

public class problem02 {
    public static void main(String[] args) {
        int score = 86;
        char grade;
        grade = switch (score / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            default -> 'D';
        };


        System.out.println("점수: " + score);
        System.out.println("등급: " + grade);
    }
}
