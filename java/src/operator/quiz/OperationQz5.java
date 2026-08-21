package operator.quiz;

public class OperationQz5 {
    public static void main(String[] args) {
        int num = 5; // 00000101

        System.out.println(num << 1); // 00001010
        System.out.println(num << 2); // 00010100
        System.out.println(num >>> 1); // 00000010
    }
}
