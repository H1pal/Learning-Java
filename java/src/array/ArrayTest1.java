package array;

public class ArrayTest1 {
    public static void main(String[] args) {
        // 자료형 뒤에 대괄호, 변수명 뒤에 대괄호 모두 가능
//        int num[];

        int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 중괄호로 배열 값들 초기화

        System.out.println("배열의 길의: " + num.length); // arr.length: 배열의 길이 프로퍼티

        // 대괄호로 배열에 접근 arr[n]
        System.out.println(num[0]);

        // 반복문을 활용하여 전값에 접근
        for (int i = 0;i < num.length;i++) {
            System.out.print(num[i] + "\t");
        }


    }
}
