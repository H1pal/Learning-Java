package operator.assigments;

/*
• 클래스 이름: OperationAssignment2

• int num1 = 7;
• int num2 = 2;
• num1, num2 의 자료형은 변경하지 않음
• 명시적 자료형 변환을 사용할 것
• 결과는 double result에 저장

실행
결과 3.5
 */

public class OperationAssignment2 {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 2;
        double result = num1 / (double)num2;

        System.out.print(result);
    }
}
