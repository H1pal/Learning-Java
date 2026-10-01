package encapsulation;

public class PhoneStore {
    private Phone phone;

    public PhoneStore(Phone phone) {
        this.phone = phone;
    }

    // 판매 가능하면 판매할 폰을 반환, 판매가 불가능하면 null값을 반환
    public Phone sellPhone(String ct_model, double budget) {
        // 폰 가격보다 고객의 예산이 크거나 같고 원하는 모델이 같으면 판매 가능

        // 판매할 폰
        String model = phone.getModel();
        double price = phone.getPrice();

        // 고객
        if (ct_model.equals(model)) { // A.equals(B): A와 B 문자열 비교 함수 (반환값 - true/false)
            if (budget >= price) {
                // 요금제 등록
                registerPayment();
                // 할인
                discountPromotion();
                // 데이터를 저장하고 새로운 폰으로 이동
                saveData();
                return phone;
            } else {
                System.out.println("대리점: 가격에 충족되지 않는 예산입니다.");
            }
        } else {
            System.out.println("대리점: 해당 모델이 존재하지 않습니다.");
        }
        return null;
    }

    private void registerPayment() {
        System.out.println("대리점: 요금제 등록합니다. 약정을 등록합니다.");
    }

    private void discountPromotion() {
        System.out.println("대리점: 프로모션을 할인합니다.");
    }

    private void saveData() {
        System.out.println("대리점: 데이터를 저장하고 새로운 폰으로 이동합니다.");
    }
}
