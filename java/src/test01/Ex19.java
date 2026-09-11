package test01;

/* ex19

(for문, if문 활용)
1차원 배열을 선언하고, for문을 사용하여 'Z'에서 'A'순으로 저장하세요.
for문을 활용하여 배열 값을 순서대로 출력하세요.

*/

public class Ex19 {
    public static void main(String[] args) {
        char[] arr = new char[26];
        char alpha = 'Z';
        for (int i = 0;i < 26;i++) arr[i] = alpha--;
        for (int i = 0;i < 26;i++) System.out.print(arr[i]);
    }
}
