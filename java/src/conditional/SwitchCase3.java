package conditional;

public class SwitchCase3 {
    public static void main(String[] args) {
        int month = 2;

        int day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                System.out.println("가장 짧은 달입니다.");
                yield 28;
            }
            default -> { // (중괄호로 감싸야 작동)
                System.out.println("없는 값 입니댜.");
                yield 0; // yield: switch가 변수에 대입시키는 역할을 할 시에 특정 값을 반환한다는 의미  (switch버전의 return)
                // 0을 반환
            }
        };

        System.out.println(month + "는 총 " + day + "입니다.");
    }
}
