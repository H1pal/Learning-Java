package operator.assigments;

/*
• int kor = 85;
• int eng = 90;
• int math = 78;
• 세 과목의 합계를 total에, 평균을 double avg에 저장하세요.
• 평균이 80점 이상인지 판단하여 boolean pass에 저장하세요.
• 삼항 연산자를 사용(if문 금지) 하여 평균이 80점 이상이면 "통과", 아니면
"미통과"를 출력하세요.
• 평균은 소수 첫째 자리까지 출력하세요.

실행
결과

합계: 253
평균: 84.3
결과: 통과
 */

public class OperationAssignment6 {
    public static void main(String[] args) {
        int kor = 85;
        int eng = 90;
        int math = 78;

        int total = kor + eng + math;
        double avg = total / 3.0;
        boolean pass = avg >= 80;

        System.out.printf("합계: %d\n", total);
        System.out.printf("평균: %.1f\n", avg);
        System.out.print("결과: "+(pass ? "통과" : "미통과"));

    }
}
