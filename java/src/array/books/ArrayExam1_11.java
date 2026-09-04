package array.books;

import java.util.Scanner;

public class ArrayExam1_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("배열의 크기 입력 : ");
        int size = scan.nextInt();
        int[] dynamicArray = new int[size];

        System.out.println("생성된 배열의 크기 : " + dynamicArray.length);
        scan.close();
    }
}
