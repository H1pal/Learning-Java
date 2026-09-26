package accessModifier.developer;

// accessModifier.company.Employee 경로에 있는 클래스 불러오기
import accessModifier.company.Employee;

// Employee에서 상속 받음
public class Developer extends Employee {

    public void printInfo() {
        System.out.println(name);
        System.out.println(department); // 다른 패키지이지만 상속을 통해 접근 가능 (protected)
//        System.out.println(email); // 다른 패키지에 있어 접근 불가 (default)
//        System.out.println(salary); // 같은 패키지도 아니며, 클래스 내부에 있지도 아니하여 접근 불가
    }
}
