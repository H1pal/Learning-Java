package accessModifier.company;

public class Employee {
    public String name = "점수"; // 모든 위치
    protected String department = "개발팀"; // 같은 패키지 또는 자식 클래스
    String email = "soo@company.com"; // 같은 패키지
    private int salary = 5000000; // 클래스 내
    // private -> 정보 은닉

    public void printInfo() {
        System.out.println(name);
        System.out.println(department);
        System.out.println(email);
        System.out.println(salary);
    }
}
