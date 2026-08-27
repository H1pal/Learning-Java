package conditional;

public class SwitchCase1 {
    public static void main(String[] args) {
        int ranking;
        char medalColor = 'N';

        ranking = 2;
        switch (ranking) {
            case 1:
                medalColor = 'G';
                break;
            case 2:
                medalColor = 'S';
                break;
            case 3:
                medalColor = 'B';
                break;
            default:
                System.out.println("획득한 메달이 없습니다");
        }

        System.out.println(ranking + "등 메달은 " +medalColor);
    }
}
