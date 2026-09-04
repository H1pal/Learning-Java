package array;

public class CharArray {
    public static void main(String[] args) {
        char[] alphabet = new char[26];
        char ch = 'A';

        for(int i = 0;i < alphabet.length;i++){
            alphabet[i] = ch++; // A부터 시작해서 아스키코드값으로 접근
        }
        for(int i = 0;i < alphabet.length;i++){
            System.out.printf("%c: %d\n", alphabet[i],(int)alphabet[i]);
        }

//        alphabet[26] = 'a';
        // ArrayIndexOutOfBounds: 크기는 26, 접근 가능한 주소값은 25까지이기 때문에 배열의 범위에 벗어나느 접근

        char[] allAlphabet = new char[52];
        // alphabet의 0번째 칸부터 allAlphabet의 0번재 칸부터 26칸짜리를 붙여넣기
        System.arraycopy(alphabet,0,allAlphabet,0, 26);
        for (int i = alphabet.length;i < allAlphabet.length;i++){
            allAlphabet[i] = ch++;
        }
        for(int i = 0;i < allAlphabet.length;i++){
            System.out.print(allAlphabet[i]+"\t");
        }
    }
}
