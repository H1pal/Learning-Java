package chapter2;

public class CharacterEx3 {
    public static void main(String[] args) {
        int a = 65;
        int b = -65;

        char a2 = 65;

        System.out.println((char)a);
        System.out.println((char)b); // char형에 음수는 들어갈 수 없기 때문 오류 출력
        System.out.println(a2);
    }
}
