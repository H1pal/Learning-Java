package chapter2;

public class ImplicitConversion2 {
    public static void main(String[] args) {
        byte bNum = 10; // camelCase 표기법
        int iNum = bNum; // 정수형으로 자동 형변환

        System.out.println(bNum);
        System.out.println(iNum);


        int iNum2 = 20;
        float fNum = iNum2; // float형으로 자동 형변환
        System.out.println(fNum);

        System.out.println(fNum + iNum2); // 실수형 + 정수형 = 실수형


        double dNum;
        dNum = fNum + iNum;
        System.out.println(dNum); // double형도 자동 형변환
    }
}
