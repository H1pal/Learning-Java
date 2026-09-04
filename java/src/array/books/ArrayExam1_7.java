package array.books;

public class ArrayExam1_7 {
    public static void main(String[] args) {
        int[] arr = new int[] {10, 20, 30, 40, 50};
        System.out.println(arr[5]);
        // error: Index 5 out of bounds for length 5
        // 배열의 인덱스는 0붵 시작되므로, 5개의 배열 요소를 위해 인덱스 0~4까지 5개의 메모리가 확보되고, 10, 20, 30, 40, 50이 각 배열 방에 지정된다.
    }
}
