package chapter2;

public class IntegerEx1 {
    public static void main(String[] args) {
        // int는 4byte의 크기를 가지고 2147483648는 그의 int 수의 표현 범위를 벗어나기 때문에 오류가 발생한다
//        int a = 2147483648;
        int a = 2147483647; // 올바른 표현방식 -2147483648 ~ 2147483647
        System.out.println(a);

    }
}
