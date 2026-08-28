package loop;

public class WhileEx2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        do {
            sum += i++;
        } while (i <= 10);
        System.out.println("1부터 10까지의 합: " + sum);

        /* while과 do while의 차이점 */
        sum = 0;
        i = 1;

        // 무조건 1회 실행 후 조건 검사
        do {
            sum += i++;
        } while (i <= 0);
        System.out.println(sum);

        i = 1;
        sum = 0;

        // 처음부터 조건 검사
        while (i <= 0) {
            sum += i++;
        }
        System.out.println(sum);
    }
}
