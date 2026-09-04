package array.assignments;

/*
- 클래스 이름: ArrayEx1

- int[] arr = new int[]{10, 20, 30, 40};
- for문을 사용하여 배열 요소 출력하기

실행
결과

arr[0] = 10
arr[1] =20
arr[2] =30
arr[3] = 40
* */

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] arr = new int[] {10, 20, 30, 40};
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
