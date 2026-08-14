package chapter2;

public class ExplicitConversion1 {
    public static void main(String[] args) {
        byte val6 = (byte)128; // byte의 범위는 1바이트(-128~127) 즉, 강제 형변환
        /* 원리:
        128은 10000000, 맨 앞은 부호 비트이기 때문에 -,
        그리고 이를 2의 보수로 표현하면 01111111 + 1 = 10000000
        즉, -128
        */
        int val7 = (int)5.5;


        System.out.println(val6);
        System.out.println(val7);

    }
}
