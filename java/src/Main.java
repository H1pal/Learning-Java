//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        char[] decode = {'I', ' ', 'a', 'm', ' ', 'a', ' ', 's', 'p', 'y'};
        char[] code = new char[decode.length];
        for (int i = 0;i < decode.length;i++) {
            code[i] = decode[decode.length-i-1];
        }
        System.out.println(new String(code));
    }
}