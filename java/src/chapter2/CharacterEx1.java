package chapter2;

public class CharacterEx1 {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println((int)ch1); // A의 아스키코드 결과값이 출력

        char ch2 = 66; // char형에 정수형은 아스키코드로 인식
        System.out.println(ch2);

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3); // 정수형 -> char의 아스키코드로 인식되어 변환

        char ch4 =  '한';
        char ch5 = '\ud55C';
        // \\u 유니코드 이스케이프 시퀀스로 접근
        System.out.println(ch4);
        System.out.println(ch5);
    }
}
