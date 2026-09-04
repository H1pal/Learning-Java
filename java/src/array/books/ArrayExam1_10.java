package array.books;

public class ArrayExam1_10 {
    public static void main(String[] args) {
        int[] a;
        int[] b;
        int[] c = {31, 32, 33};
        a = new int[5];
        b = new int[]{21, 22, 23, 24};

        System.out.printf("%d %d %d\n", a.length, b.length, c.length);
        c = b;
        System.out.printf("%d %d %d\n", a.length, b.length, c.length);

        for (int i = 0;i < b.length;i++) {
            System.out.print(b[i] + "\t");
        }
        System.out.println();
        for (int i = 0;i < c.length;i++) {
            System.out.print(c[i] + "\t");
        }
    }
}
