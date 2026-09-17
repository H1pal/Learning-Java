package objectOriented;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo() {
        System.out.println(studentName + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public static void main(String[] args) {
        Student studentLee = new Student(); // Student 인스턴트의 메모리를 가리키는 참조 변수(객체) 생성
        studentLee.studentName = "이순신"; // studentLee의 객체 인스터트에서 studentName 속성에 값 초기화
        // {참조 변수}.{멤버 변수}

        Student studentAhn = new Student(); // Student의 객체 생성
        studentAhn.studentName = "안중근";

        Student studentKim = new Student(); // Student의 객체 생성
        studentKim.studentName = "김좌진";

        System.out.println(studentLee.studentName); // studentLee의 객체 속성 불러오기
        System.out.println(studentLee.getStudentName()); // student의 이름 멤버 변수를 반환해주는 함수 호출
        System.out.println(studentAhn.getStudentName());
        System.out.println(studentKim.getStudentName());

        // 참조 변수의 힙 메모리 주소가 출력
        System.out.println(studentLee);
        System.out.println(studentAhn);
        System.out.println(studentKim);
    }
}
