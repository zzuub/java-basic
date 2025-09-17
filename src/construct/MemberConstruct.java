package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    //생성자 오버로딩
    MemberConstruct(String name, int age){
        //생성자 내부에서 자신의 생성자 호출
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name= " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
