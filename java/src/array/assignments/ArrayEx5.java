package array.assignments;

/*
- 클래스 이름: ArrayEx5
- char[][] arr = new char[3][4];
- char alpha = ‘A’;
- 중첩 for문을 사용하여 배열에 A~L까지 입력한다.
- 중첩 for문을 사용하여 배열 요소 출력하기

실행
결과

A B C D
E F G H
I J K L
* */

public class ArrayEx5 {
    public static void main(String[] args) {
        char[][] arr = new char[3][4];
        char alpha = 'A';
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][j] = alpha++;
            }
        }

        for (char[] chars : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }
    }
}
