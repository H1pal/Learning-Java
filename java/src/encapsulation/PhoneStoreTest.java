package encapsulation;

public class PhoneStoreTest {
    public static void main(String[] args) {
        Phone p1 = new Phone("아이폰", 3000000); // 폰
        PhoneStore ps1 = new PhoneStore(p1);
        Customer c1 = new Customer("유희성", "샤오미", 2500000);
        c1.purchasePhone(ps1);
    }
}
