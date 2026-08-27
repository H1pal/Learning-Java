package conditional;
/*
• 클래스 이름: ConditionEx3
• double distance = 8.5;
• 1km 이하 → 도보
• 10km 이하 → 자전거
• 50km 이하 → 버스
• 50km 초과 → 기차
 */

public class ConditionEx3 {
    public static void main(String[] args) {
        double distance =  8.5;
        String vehicle;

        if (distance <= 1) vehicle = "도보";
        else if (distance <= 10) vehicle = "자전거";
        else if (distance <= 50) vehicle = "버스";
        else vehicle = "기차";

        System.out.println("추천 이동 수단: " + vehicle);
    }
}
