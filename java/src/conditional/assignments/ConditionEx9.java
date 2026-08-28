package conditional.assignments;
/*
• 클래스 이름: ConditionEx9

• int num1 = 20; int num2 = 5; char op = '/';
• + , -, *, / → 덧셈, 뺄셈, 곱셈, 나눗셈
• / 연산에서 num2가 0이면 → 0으로 나눌 수 없습니다.
• 다른 문자가 들어 있으면 → 잘못된 연산자입니다.

실행
결과 20 / 5 = 4
 */

public class ConditionEx9 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;
        char op = '/';

        String result = switch (op) {
            case '+' -> num1 +" + "+ num2 + " = " + (num1 + num2);
            case '-' -> num1 +" - "+ num2 + " = " + (num1 - num2);
            case '*' -> num1 +" * "+ num2 + " = " + (num1 * num2);
            case '/' -> num2 != 0 ? num1 +" / "+ num2 + " = " + (num1 / num2) : "0으로 나눌 수 없습니다.";
            default -> "잘못된 연산자입니다.";
        };

        System.out.println(result);
    }
}
