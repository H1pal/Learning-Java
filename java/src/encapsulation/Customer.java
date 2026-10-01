package encapsulation;

public class Customer {
    private String name;
    private String model;
    private double budget;

    public Customer(String name, String model, double budget) {
        this.name = name;
        this.model = model;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void purchasePhone(PhoneStore store) {
        Phone phone = store.sellPhone(model, budget);
        // 구매가 가능하면 구입 완료, 불가능하면 구입 불가능
        System.out.println("고객: " + (phone != null ? "핸드폰 구입이 완료되었습니다." : "핸드폰을 구입하지 못했습니다."));
    }
}
