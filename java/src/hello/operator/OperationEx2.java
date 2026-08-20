package hello.operator;

public class OperationEx2 {
    public static void main(String[] args) {
        int gameScore = 150;
        int lastScore = ++gameScore;
        // ++gameScore: 전위 증가 연산자
        // gameScore에 1을 '먼저' 증가시킨 후 lastScore에 대입

        System.out.println(gameScore); // 151
        System.out.println(lastScore); // 151

        int lastScore2 = gameScore++;
        // 후위 증가 연산자
        // lastScore에 대입 후 gameScore에 1을 증가
        System.out.println(lastScore2); // 151
        System.out.println(gameScore); // 152

        int lastScore3 = --gameScore;
        // 전위 감소 연산자
        // gameScore에 1을 감소시킨 후 lastScore에 대입
        System.out.println(lastScore3); // 151
        System.out.println(gameScore); // 151

        int lastScore4 = gameScore--;
        //후위 감소 연산자
        // lastScore에 대입 후 gameScore에 1을 감소
        System.out.println(lastScore4); // 151
        System.out.println(gameScore); // 150
    }
}
