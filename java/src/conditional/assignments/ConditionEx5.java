package conditional.assignments;
/*
• 클래스 이름: ConditionEx5

• double rating = 8.6;
• 9점 이상 → 강력 추천합니다.
• 8점 이상 → 추천합니다.
• 7점 이상 → 볼 만합니다.
• 7점 미만 → 추천하지 않습니다.
 */

public class ConditionEx5 {
    public static void main(String[] args) {
        double rating = 8.6;
        String recommend;
        if (rating >= 9) recommend = "강력 추천합니다.";
        else if (rating >= 8) recommend = "추천합니다.";
        else if (rating >= 7) recommend = "볼 만합니다.";
        else recommend = "추천하지 않습니다.";

        // 삼항 연산자로 express하기
//        recommend = rating >= 9 ? "강력 추천합니다."
//                : rating >= 8 ? "추천합니다."
//                : rating >= 7 ? "볼 만합니다."
//                : "추천하지 않습니다.";


        System.out.println(recommend);
    }
}
