package chapter2;

public class ScopeQz1 {
    public static void main(String[] args) {
        int a = 10; // a의 스코프: main의 범위 (5행 ~ 12행)
        {
            int b = 20; // b의 스코프: 7행 ~ 8행
            System.out.println(a + b);
        }
            int c = 30; // c의 스코프: 10행 ~ 12행
            System.out.println(a + c);
//        System.out.println(b); 접근 불가
    }
}
