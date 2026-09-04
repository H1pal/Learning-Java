package array.books;

public class ArrayExam1_9 {
    public static void main(String[] args) {
        String[] str = new String[3];
        str[0] = "Happy";
        str[1] = "Meister";
        str[2] = "School";
        for (int i = 0; i < str.length; i++) {
            System.out.printf("str[%d] = %s\n", i, str[i]);
        }
    }
}
