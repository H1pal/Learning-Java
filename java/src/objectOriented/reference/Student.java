package objectOriented.reference;

public class Student {
    int studentID;
    String studentName;
    // Subject라는 하위 클래스를 나눠 멤버 변수 관리
    Subject korean = new Subject();
    Subject math = new Subject();

    public Student() {
    }

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void setKoreanSubject(String subjectName, double score) {
        korean.setSubjectName(subjectName);
        korean.setScore(score);
    }

    public void setMathSubject(String subjectName, double score) {
        math.setSubjectName(subjectName);
        math.setScore(score);
    }

    public void showStudentInfo() {
        System.out.printf("%s님의 %s 과목의 점수는 %.1f이고,\n", studentName, korean.getSubjectName(), korean.getScore());
        System.out.printf("%s 과목의 점수는 %.1f입니다.\n", math.getSubjectName(), math.getScore());
    }
}
