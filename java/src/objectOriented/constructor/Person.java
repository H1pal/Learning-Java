package objectOriented.constructor;

public class Person {
    String name;
    float weight;
    float height;

//    public Person() {}
    // 내부에 생성자 함수가 없어도 컴파일러가 자동으로 default constructor를 만듦
    public Person(String pname) { // 생성자 함수에 매개변수를 두어 생성자에서 매개변수를 받도록 함
        name = pname;
    }
    public Person() {} // 생성자에서 매개변수를 다양하게 받을 수 있도록 생성자 함수를 여러 개 만들기 가능(디폴트 생성자 함수 직접 구현)

    public Person(String pname, float pheight, float pweight)
    {
        name = pname;
        height = pheight;
        weight = pweight;
    }


}
