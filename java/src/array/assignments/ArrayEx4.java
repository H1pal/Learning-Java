package array.assignments;

/*
- 클래스 이름: ArrayEx4

- int[] arr = new int[]{89, 76, 100, 68, 48, 98, 56, 77, 95};
- for문을 사용하여 arr의 합을 구하기
- 평균을 구하여 출력하기(평균은 소수점 첫번째 자리까지)

실행
결과

점수의 합: 707
점수의 평균: 78.6
* */

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] arr = new int[]{89, 76, 100, 68, 48, 98, 56, 77, 95};
        int sum = 0;
        double avg = 0;
        for (int j : arr) {
            sum += j;
        }
        avg = sum / (double)arr.length;
        System.out.println("점수의 합: " + sum);
        System.out.printf("점수의 평균: %.1f", avg);
    }
}
