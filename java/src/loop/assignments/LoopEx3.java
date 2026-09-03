package loop.assignments;

/*
• 클래스 이름: LoopEx3

• 중첩 for문을 사용
• 중첩 for문을 제어할 변수로 i와 j를 사용
• 슬라이드 18쪽 참고

실행
결과

*
**
***
****
*****
* */
public class LoopEx3 {
    public static void main(String[] args) {
        for (int i = 0;i < 5;i++) {
            for (int j = 0;j < i+1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
