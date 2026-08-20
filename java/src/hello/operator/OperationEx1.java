package hello.operator;

public class OperationEx1 {
    public static void main(String[] args) {
        int mathScore = 90;
        int engScore = 70;

        // 총점 구하기
        int totalScore = mathScore + engScore;
        System.out.println(totalScore);

        // 평균 구하기
//        int avgIntScore = mathScore / 2.0;
//        실수형으로 나누어지기 때문에 실수형 반환 -> int 자료형은 값을 받지 못함
        double avgScore = totalScore / 2.0;
        System.out.println(avgScore);
    }
}
