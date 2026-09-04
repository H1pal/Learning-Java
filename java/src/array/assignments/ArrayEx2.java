package array.assignments;

/*
- 클래스 이름: ArrayEx2
- char[] arr = new char[10];
- Char alpha = ‘A’;
- for문을 사용하여 배열에 A~J까지 입력한다.
- for문을 사용하여 배열 요소 출력하기

실행
결과 ABCDEFGHIJ
* */

public class ArrayEx2 {
    public static void main(String[] args) {
        char[] arr = new char[10];
        char alpha = 'A';
        for (int i = 0; i < arr.length; i++) {
            arr[i] = alpha++;
        }
        for (char c : arr) {
            System.out.print(c);
        }
    }
}
