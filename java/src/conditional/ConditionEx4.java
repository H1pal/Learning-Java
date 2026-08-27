package conditional;
/*
• 클래스 이름: ConditionEx4

• int dollar = 50; int exchangeRate = 1400;
• dollar가 음수이면 → 잘못된 금액입니다.
• dollar가 0이면 → 환전할 금액이 없습니다.
• dollar가 0보다 크면 → 환전 금액 출력
 */

public class ConditionEx4 {
    public static void main(String[] args) {
        int dollar = 50;
        int exchangeRate = 1400;

        if (dollar <= 0) System.out.println("잘못된 금액입니다.");
        else if (dollar == 0) System.out.println("환전할 금액이 없습니다.");
        else System.out.printf("환전 금액은 %d입니다.", dollar * exchangeRate);
    }
}
