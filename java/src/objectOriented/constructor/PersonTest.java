package objectOriented.constructor;

import com.sun.security.jgss.GSSUtil;

public class PersonTest {
    public static void main(String[] args) {
//        Person personLee = new Person(); // 같은 패키지의 클래스의 인스터트 생성하기(public)
        // Person(): 생성자


        /* 매개변수를 받는 생성자 함수만 있을 때 */
        // 생성자에 매개변수를 집어넣지 않으면 오류가 발생
        // => 클래스에서 생성자 함수애 매개변수를 추가하였기 때문
        Person personLee = new Person("이순신");
        System.out.println(personLee.name);

        /* 생성자 함수 하나 더 만들 후 */
        // 디폴트 생성자를 따로 직접 생성하여 오류 해결
        Person personAhn = new Person();
        personAhn.name = "안중근";
        System.out.println(personAhn.name);

        Person personKim = new Person("유희성", 180.0f, 70.0f);
        System.out.println("이름: " + personKim.name);
        System.out.println("키: " + personKim.height);
        System.out.println("몸무게: " + personKim.weight);
    }
}
