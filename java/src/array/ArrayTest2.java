package array;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
        double[] data = new double[5]; // 더블형으로 길이가 5인 배열 생성
        int size = 0;

        data[0] = 10.0;
        size++;
        data[1] = 20.0;
        size++;
        data[2] = 30.0;
        size++;


        System.out.println(data.length);

        // 아래 코드는 배열에 길이에 따라서 값을 모두 초기화하지 않았을 때 자동으로 0의 값이 채워지는 것을 확인할 수 있음
        for (int i = 0; i < size; i++) { // 배열의 길이가 이미 선언되었을 때 0의 값을 출력하지 않기 위해 크기를 직접 더해 활용
            System.out.print(data[i] + "\t");
        }

    }
}
