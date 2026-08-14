package chapter2;

public class Variable2 {
    public static void main(String[] args) {
        // 타입 추론 가능(자료형을 쓰지 않아도 자동으로 변수형이 타입)
        var i = 10;
        var j = 10.0;
        var str = "hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "Hello world";
        System.out.println(str);


        // javaScript와는 다르게 java의 var는 정적 타입이기 떄문에 자료형이 한 번 정해질 시 바뀌지 않음
        // str = 3;
    }

}
