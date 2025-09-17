package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    //this -> 자신의 인스턴스 참조값
    void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
