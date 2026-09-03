package array;

public class CharArray {
    public static void main(String[] args) {
        char[] alphabet = new char[26];
        char ch = 'A';

        for(int i = 0;i < alphabet.length;i++){
            alphabet[i] = ch++;
        }
        for(int i = 0;i < alphabet.length;i++){
            System.out.printf("%c: %d\n", alphabet[i],(int)alphabet[i]);
        }
    }
}
