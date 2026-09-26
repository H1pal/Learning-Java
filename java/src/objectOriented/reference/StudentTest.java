package objectOriented.reference;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1001, "이정환"); // Student의 참조 변수

        // student.korean.score 이 방식으로 접근하면 코드 구조가 번거로워짐
        studentLee.setKoreanSubject("국어", 100);
        studentLee.setMathSubject("수학", 99);

        studentLee.showStudentInfo();
        System.out.println();

        Student studentPark = new Student(1002, "박병일");

        studentPark.setKoreanSubject("국어", 82);
        studentPark.setMathSubject("수학", 100);

        studentPark.showStudentInfo();
    }
}