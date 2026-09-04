package array.assignments;

/*
- 클래스 이름: ArrayEx3

- 길이가 5인 정수형 1차원 배열 arr 선언
- for문과 if문을 사용하여 배열에 값을 입력
- for문을 사용하여 배열 요소 출력하기

실행
결과 2 4 6 8 10
* */

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int num = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                arr[num++] = i;
            }
        }
        for (int j : arr) {
            System.out.print(j + "\t");
        }
    }
}
