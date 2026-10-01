package thisDemo;

public class Birthday {
    int year;
    int month;
    int day;

    public Birthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void printThis() {
        System.out.println(this);
    }
}
