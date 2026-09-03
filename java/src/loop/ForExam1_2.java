package loop;

public class ForExam1_2 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i+= 4) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("반복문을 빠져나온 후의 값 : " + i);
    }
}
