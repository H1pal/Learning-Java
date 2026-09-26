package accessModifier.dateTest;

public class MyDate {
    // public -> 아무렇게나 접근할 수 있어 위험
    private int day;
    private int month;
    private int year;

    public void setdate(int month, int day) {
        String errorMessage = "Invalid Date";
        if (month >= 1 && month <= 12) {
            if (month == 2) {
                if (day < 1 || day > 28) {
                    System.out.println(errorMessage + ": 2월은 1부터 28 또는 29일까지 존재");
                }
                else this.day = day;
            }
            else System.out.println();
        }
        else System.out.println(errorMessage + ": 1월부터 12월까지 존재");
    }
}
