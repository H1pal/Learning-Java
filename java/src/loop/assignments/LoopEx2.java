package loop.assignments;

/*
• 클래스 이름: LoopEx2

• while문 사용
• while문을 제어할 변수로 i 사용

실행
결과 학생 1번 안녕하세요.
학생 2번 안녕하세요.
학생 3번 안녕하세요.

...
학생 9번 안녕하세요.
학생 10번 안녕하세요.
* */
public class LoopEx2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.printf("학생 %d번 안녕하세요\n", i++);
        }

    }
}
