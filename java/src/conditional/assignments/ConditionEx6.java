package conditional.assignments;
/*
• 클래스 이름: ConditionEx6
• int score = 84; char grade; String result;
• 90 이상 → A, 탁월한 성과입니다.
• 80 이상 → B, 좋은 성과입니다.
• 70 이상 → C, 준수한 성과입니다.
• 60 이상 → D, 향상이 필요합니다.
• 60 미만 → F, 불합격입니다.
 */

public class ConditionEx6 {
    public static void main(String[] args) {
        int score = 84;
        char grade;
        String result;

        if (score >= 90) {
            grade = 'A';
            result = "탁월한 성과입니다.";
        } else if (score >= 80) {
            grade = 'B';
            result = "좋은 성과입니다.";
        } else if (score >= 70) {
            grade = 'C';
            result = "준수한 성과입니다.";
        } else if (score >= 60) {
            grade = 'D';
            result = "향상이 필요합니다.";
        } else {
            grade = 'F';
            result = "불합격입니다.";
        }

        System.out.println("학점: " + grade);
        System.out.println("성취도: " + result);
    }
}
