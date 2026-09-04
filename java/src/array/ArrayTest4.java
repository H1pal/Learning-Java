package array;

import java.util.Arrays;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3 ,4},
                {5, 6 ,7, 8},
                {9, 10, 11, 12}
        };

        int num1 = numbers[0][1];
        int num2 = numbers[0][3];

        System.out.printf("numbers[0][1]: %d, numbers[0][3]: %d\n", num1, num2);


        int rows = numbers.length;
        int cols = numbers[0].length;
        System.out.println("행의 길이: " + rows);
        System.out.println("열의 길이: " + cols);


    }
}
