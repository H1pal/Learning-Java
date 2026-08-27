package conditional;

public class SwitchCase2 {
    public static void main(String[] args) {
        String medal = "Gold";
        char m = 'N';
        String message = "NULL";

        // switch를 이용하여 message에 직접 대입할 수 있음 (화살표만 가능)
        message = switch (medal) {
//            case "Gold":
//                m = '금';
//                break;
//            case "Gold" -> {
//                m = '금';
//                "금메달입니다.";
//            } // 화살표로 표현 가능 (break 없어도 위와 동일하게 동작)
//            case "Silver" -> m = '은';
//            case "Bronze" -> m = '금';
//            default -> System.out.println("획득한 메달이 없습니다.");
            case "Gold" -> "금메달입니다.";
            case "Silver" -> "은메달입니다.";
            case "Bronze" -> "동메달입니다.";
            default -> "메달이 없습니다.";
        };

        System.out.println(message);
//        System.out.printf("%c메달입니다.", m);
    }
}
