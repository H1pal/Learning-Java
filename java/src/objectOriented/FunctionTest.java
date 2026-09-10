package objectOriented;

public class FunctionTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = add(num1, num2);

        System.out.printf("%d + %d = %d",num1, num2, sum);
    }

    private static int add(int n1, int n2) {
        return n1 + n2;
    }
}
