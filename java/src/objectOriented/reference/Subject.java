package objectOriented.reference;

public class Subject {
    String subjectName;
    double score;

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
        // this.{멤버 변수}: 현재 이 객체의 멤버 변수를 가리킴
    }

    public void setScore(double score) {
        this.score = score;
    }

    // 과목명을 반환하는 함수
    public String getSubjectName() {
        return subjectName;
    }

    public double getScore() {
        return score;
    }
}
