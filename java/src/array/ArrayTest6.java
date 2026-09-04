package array;

public class ArrayTest6 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3 ,4},
                {5, 6 ,7},
                {5, 9, 10, 11, 12},
                {13, 14},
                {15, 16, 17}
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%-4d",  numbers[i][j]);
            }
            System.out.println();
        }
    }
}
