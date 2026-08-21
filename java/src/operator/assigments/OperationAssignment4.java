package operator.assigments;

/*
• 클래스 이름: OperationAssignment4

• int a = 35;
• int b = 28;
• if문 사용 금지
• 삼항 연산자 ? : 사용

실행
결과 더 큰 숫자는 35입니다.
 */

public class OperationAssignment4 {
    public static void main(String[] args) {
        int a = 35;
        int b = 28;
        int max = a > b ? a : b;

        System.out.printf("결과 더 큰 숫자는 %d입니다.", max);
    }
}
