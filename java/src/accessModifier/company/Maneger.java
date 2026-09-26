package accessModifier.company;

public class Maneger {

    public static void main(String[] args) {
        Employee emp = new Employee();

        System.out.println(emp.name);
        System.out.println(emp.email);
        System.out.println(emp.department);
//        System.out.println(emp.salary); private 접근제어자로 인해서 접근 오류 발생

    }
}
