package chapter2;

/*
다음 코드 중 컴파일 오류가 발생하는 문장을 모두 찾고,
오류가 발생하는 이유를 주석처리하여 적으세요.

1. byte a = 10;
2. short b = 200;
3. byte c = 150;
4. int d = 300;
5. long e = 5000000000;
6. float f = 5.7;
7. double g = 5.7;
8. boolean h = true;
9. char i = 'A';
* */
public class VarAssignment4 {
    public static void main(String[] args) {
        byte a = 10;
        short b = 200;
        /* byte의 크기 범위는 -128 ~ 128까지 밖에 저장하지 못하므로 오류가 발생 */
//        byte c = 150;
        int d = 300;
         /* long 타입의 숫자는 숫자 뒤에 `L`을 적어 표시해야 함 */
//        long e = 5000000000;
        /* float 타입의 실수형은 숫자 뒤에 `f`를 적어 표시해야 함 */
//        float f = 5.7;
        double g = 5.7;
        boolean h = true;
        char i = 'A';
    }
}
