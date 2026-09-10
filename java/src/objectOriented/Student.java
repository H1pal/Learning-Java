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
        Student studentLee = new Student();
        studentLee.studentName = "이순신"; // studentLee의 객체 인스터트에서 studentName 속성에 값 초기화

        System.out.println(studentLee.studentName); // studentLee의 객체 속성 불러오기
        System.out.println(studentLee.getStudentName()); // student의
    }
}
