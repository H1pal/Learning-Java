package operator.assigments;

/*
조건 - 클래스 이름: OperationAssignment1

- 변수 초기값: val1 = 2.5, val2 = 3.5, val3 = 6.5;
- 합계는 sum, 평균은 avg 변수에 저장
- 합계와 평균 모두 소수 첫째 자리까지만 출력(소수 둘째자리에서 반올림)
- 힌트: System.out.printf(“%.1f”, 변수);

실행
결과

합계: 12.5
평균: 4.2 */

public class OperationAssignment1 {
    public static void main(String[] args) {
        double val1 = 2.5;
        double val2 = 3.5;
        double val3 = 6.5;

        double sum = val1 + val2 + val3;
        double avg = sum / 3;
        System.out.printf("%.1f\n", sum);
        System.out.printf("%.1f", avg);
    }
}
