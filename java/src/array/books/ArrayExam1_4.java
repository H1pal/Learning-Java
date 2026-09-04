package array.books;

public class ArrayExam1_4 {
    public static void main(String[] args) {
        int[] arr = new int[/* 5 */] {10, 20, 30, 40, 50};
        // error: array creation with both dimension expression and initialization is illegal\
        // 배열 객체에 초기화를 하는 경우에는 배열의 길이를 명시적으로 지정할 수 없으므로 에러가 발생
        for (int i = 0;i < arr.length;i++)
            System.out.printf("arr[%d] = %d\n", i, arr[i]);


    }
}
