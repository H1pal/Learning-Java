package test01;

/* ex17

(배열 복사, for문 활용)
카페메뉴(cafeMenu) 중에서 "CaffeLatte"를 "VanillaLatte"로 변경하고,
for문을 활용하여 출력하세요.

*/

public class Ex17 {
    public static void main(String[] args) {
        String[] cafeMenu = {"Americano", "CaffeLatte", "MilkTea", "IceCream", "GreenTea"};
        cafeMenu[1] = "VanillaLatte";
        for (String i : cafeMenu) System.out.println(i + " ");
    }
}
