package array.books;

public class ArrayExam1_2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
//        arr.length = 3;
        // error: cannot assign a value to final variable length
        System.out.println(arr.length);
    }
}
