package loop.assignments;

/*
• 클래스 이름: LoopEx4

• 중첩 for문을 사용
• 중첩 for문을 제어할 변수로 i와 j를 사용
• 과제3 참고

실행
결과

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
* */
public class LoopEx5 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 0;i < 4;i++) {
            for (int j = 0;j < i+1;j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }

    }
}
