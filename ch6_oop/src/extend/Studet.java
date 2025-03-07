package extend;

public class Studet {

    void changeTel(String phone) {
        // this : 멤버변수 앞, 멤버 메소드 앞
        this.phone = phone;
    }

    void changeEmail(String email) {
        this.email = email;
    }

    void changegrade(int grade) {
        this.grade = grade;
    }

    void changeClassNum(int classNum) {
        this.classNum = classNum;
    }

}
