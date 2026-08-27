package conditional;
/*
• 클래스 이름: ConditionEx2

• int temp = 23;
• 30도 이상 → 더운 날씨입니다.
• 20도 이상 → 따뜻한 날씨입니다.
• 10도 이상 → 쌀쌀한 날씨입니다.
• 10도 미만 → 추운 날씨입니다.
 */

public class ConditionEx2 {
    public static void main(String[] args) {
        int temp = 23;
        String state;
        if (temp >= 30) state = "더운";
        else if (temp >= 20) state = "따뜻한";
        else if (temp >= 10) state = "쌀쌀한";
        else state = "추운";

        System.out.printf("%s 날씨입니다", state);
    }
}
