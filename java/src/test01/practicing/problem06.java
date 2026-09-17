package test01.practicing;

/*

문제

(배열, for문 활용)
for문과 배열의 인덱스를 이용하여 첫 번째, 세
번째, 다섯 번째, 일곱 번째 요소, 즉 홀수 번째에
위치한 요소들과 그 합을 출력하세요.

실행 화면 예시

홀수 번째 요소: 12 18 24 16
홀수 번째 요소의 합: 70

*/

public class problem06 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 18, 57, 24, 39, 16, 8};
        int[] newNumbers = new int[numbers.length];
        int index = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i += 2) {
            sum += numbers[i];
            newNumbers[index++] = numbers[i];
        }
        System.out.print("홀수 번째 요소: ");
        for (int i = 0; i < index;i++) System.out.print(newNumbers[i] + " ");
        System.out.println();
        System.out.print("홀수 번째 요소: " + sum);
    }
}
