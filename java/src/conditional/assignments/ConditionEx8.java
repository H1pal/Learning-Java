package conditional.assignments;
/*
• 클래스 이름: ConditionEx8
• int menu = 3;
• 1 → 아메리카노
• 2 → 카페라떼
• 3 → 초코라떼
• 4 → 녹차
• 그 외 → 없는 메뉴입니다.
 */

public class ConditionEx8 {
    public static void main(String[] args) {
        int menu = 3;
        String choice = switch (menu) {
            case 1 -> "아메리카노";
            case 2 -> "카페라떼";
            case 3 -> "초코라떼";
            case 4 -> "녹차";
            default -> "없는 메뉴입니다";
        };
        System.out.println("선택한 메뉴: " + choice);
    }
}
