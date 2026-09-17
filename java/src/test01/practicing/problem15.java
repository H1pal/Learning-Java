package test01.practicing;

/*

문제

(배열, for문 활용)
평문 문자열(decode)를 거꾸로 한 암호를 만들어
새로운 배열을 만들어 입력하고, 출력하세요.

실행 화면 예시

yps a ma I

*/

public class problem15 {
    public static void main(String[] args) {
        char[] decode = {'I', ' ', 'a', 'm', ' ', 'a', ' ', 's', 'p', 'y'};
        int len = decode.length;
        char[] reversed = new char[len];

        for (int i = 0; i < len; i++) {
            reversed[len-i-1] = decode[i];
        }
        System.out.println(new String(reversed));
    }
}
