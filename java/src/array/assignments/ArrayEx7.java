package array.assignments;

/*
- 클래스 이름: ArrayEx7

- char[] alpha1 = new char[13]; //’A’에서부터 ‘M’까지 저장
char[] alpha2 = new char[13]; //‘N’에서부터 ‘Z’까지 저장
char[] alpha = new char[26]; //두 배열을 복사하여 순서대로 입력
- alpha1, alpha2 배열에 알파벳을 입력할 때는 for문 사용
- 합친 배열 alpha를 출력(for문을 사용)

실행
결과 ABCDEFGHIJKLMNOPQRSTUVWXYZ
* */

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        char[] alpha1 = new char[13]; //’A’에서부터 ‘M’까지 저장
        char[] alpha2 = new char[13]; //‘N’에서부터 ‘Z’까지 저장
        char[] alpha = new char[26];

        char a = 'A';
        for (int i = 0; i < alpha1.length; i++) alpha1[i] = a++;
        for (int i = 0; i < alpha2.length; i++) alpha2[i] = a++;

        System.arraycopy(alpha1, 0, alpha, 0, alpha1.length);
        System.arraycopy(alpha2, 0, alpha, alpha1.length, alpha2.length);
        for (char c : alpha) {
            System.out.print(c);
        }

    }
}
