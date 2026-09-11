package test01;

/* ex18

(배열 복사, for문 활용)
merge배열에 가~하순으로 저장하고
for문을 활용하여 순서대로 출력하세요.

오답노트:
- 배열의 일부를 복사하는 메소드
    > System.arraycopy(src: Object, srcPos: int, dest: Object, destPos: int, length: int);
        src: 복사할 대상(배열)
        srcPos: 복사할 배열의

*/

public class Ex18 {
    public static void main(String[] args) {
        String[] array1 = {"가", "나", "다", "라", "마", "바", "사"};
        String[] array2 = {"아", "자", "차", "카", "타", "파", "하"};
        String[] merge = new String[array1.length + array2.length];
        System.arraycopy(array1,0,merge,0,array1.length);
        System.arraycopy(array2,0,merge,array1.length,array2.length);
        for (String i : merge) {
            System.out.print(i + " ");
        }
    }
}
