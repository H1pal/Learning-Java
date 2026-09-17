package test01.practicing;

/*

(if문, 비교연산자, 논리연산자 활용)
나이, 점수, 결과를 차례로 출력하세요.
결과는 age가 16 이상이고 score가 80 이상이면
"통과", 그렇지 않으면 "미통과"를 출력하세요.

나이: 17
점수: 85
결과: 통과
*/

public class problem01 {
    public static void main(String[] args) {
        int age = 17;
        int score = 85;
        String result = "";
        if (score >= 80 && age >= 16) result = "통과";
        else result = "미통과";

        System.out.printf("나이: " + age);
        System.out.printf("점수: " + score);
        System.out.printf("결과: " + result);

    }
}
