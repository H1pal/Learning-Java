package chapter2;

public class DoubleEx1 {
    public static void main(String[] args) {
        double dnum = 3.14; // (8 byte)
        float fnum = 3.14f; // (4 byte) float형에서 숫자 뒤에 'f'문자 필수

        System.out.println(dnum);
        System.out.println(fnum); // f가 포함되서 나오진 않음
    }
}
