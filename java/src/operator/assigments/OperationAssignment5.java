package operator.assigments;

/*
• 클래스 이름: OperationAssignment5

• int x = 17;
• 힌트: x % 2
• 문자열을 저장하는 변수는 String 타입으로 선언

실행
결과 17은 홀수입니다.
 */

public class OperationAssignment5 {
    public static void main(String[] args) {

        int x = 17;
        String oddEven = x % 2 == 1 ? "홀수" : "짝수";

        System.out.printf("%d는 %s입니다.", x, oddEven);
    }
}
