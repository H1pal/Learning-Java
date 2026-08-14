package chapter2;

public class Constant {
    public static void main(String[] args) {
        // final: 상수 자료형
        // 보통 대문자 네이밍
        final int MIN_NUM = 1;
        final int MAX_NUM;

         MAX_NUM = 1;
//        MIN_NUM = 2;
        // 한 번 할당 시 값 바꾸진 못함

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

        final double DOUBLE_VALUE = 3.14;
        // 다른 자료형으로도 생성 가능

    }
}
