package operator;

public class OperationEx3 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        /* 단락 평가 */

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
        // 논리 곱에서 앞 항의 결과값이 거짓(false)이므로 뒤의 문항이 실행되지 않음
        // i는 증가하지 않음
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
        // 논리 합에서 앞 항의 결과값이 참(true)이므로 뒤의 문항은 실행되지 않음
        // i는 증가하지 않음
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);
    }
}
