package loop.assignments;

/*
• 클래스 이름: LoopEx1

• for문 사용
• for문을 제어할 변수로 i 사용

실행
결과 학생 1번 안녕하세요.
학생 2번 안녕하세요.
학생 3번 안녕하세요.
...
학생 9번 안녕하세요.
학생 10번 안녕하세요.
* */
public class LoopEx1 {
    public static void main(String[] args) {
        for (int i = 1;i<=10;i++) {
            System.out.printf("학생 %d번 안녕하세요\n", i);
        }
    }
}
