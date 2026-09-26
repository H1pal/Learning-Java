package accessModifier.customer;

import accessModifier.company.Employee;

public class Customer {
    public static void main(String[] args) {
        Employee emp = new Employee();

        System.out.println(emp.name);
//        System.out.println(emp.email); 다른 패키지이고, 상속하고 있지도 않으므로 접근 오류 발생(protected)
//        System.out.println(emp.department); // 다른 패키지이기 때문에 접근 오류(default)
//        System.out.println(emp.salary); // private 접근제어자로 인해서 접근 오류 발생

    }
}
