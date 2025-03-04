package oop;

public class Student {
    // 멤버 변수, 멤버 메소드, 생성자,

    // 속성 : 학번(s1024125),이름(한지민),학년(1),반(3),전화번호(010-5799-8259), 이메일
    // (han82@gmail.com)
    String stuid;
    String name;
    int grade;
    int classNum;
    String phone;
    String email;

    // 생성자 : 개발자가 명시하지 않으면 컴파일러가 자동으로 default 생성자 만들어 줌
    // 클래스명 (){}
    // 기본 생성자

    // 기능 : 전화번호를 변경한다. 이메일을 변경한다. 학년을 변경한다. 반을 변경
    // 메소드 : 리턴타입 메소드명(){}
    void changeTel() {

    }

    public Student() {
    }

    // 생성자 목적
    // 멤버 변수 초기화
    public Student(String stuid, String name, int grade, int classNum, String phone, String email) {
        this.stuid = stuid;
        this.name = name;
        this.grade = grade;
        this.classNum = classNum;
        this.phone = phone;
        this.email = email;
    }

    void changeEmail() {

    }

    public Student(int grade, int classNum) {
        this.grade = grade;
        this.classNum = classNum;
    }

    void changeGrade() {

    }

    @Override
    public String toString() {
        return "Student [stuid=" + stuid + ", name=" + name + ", grade=" + grade + ", classNum=" + classNum + ", phone="
                + phone + ", email=" + email + "]";
    }

    void changeClassNum() {

    }
}
