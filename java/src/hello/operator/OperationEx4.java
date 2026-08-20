package hello.operator;

public class OperationEx4 {
    public static void main(String[] args) {
        int fatherAge = 45;
        int motherAge = 47;

        char ch1;
        ch1 = (fatherAge > motherAge) ? 'F' : 'M';

        System.out.println(ch1);

        char ch2;
        if (fatherAge > motherAge) ch2 = 'F';
        else ch2 = 'M';
        System.out.println(ch2);
    }
}
