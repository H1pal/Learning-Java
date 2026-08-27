package conditional;

public class ConditionEx1 {
    public static void main(String[] args) {
        int price = 35000;
        int age = 17;
        int discount = 0;

        if (price >= 30000) discount += 3000;
        if (age <= 18) discount += 2000;

        price -= discount;
        System.out.println("최종 결제 금액: " + price);
    }
}
