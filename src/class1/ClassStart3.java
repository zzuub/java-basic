package class1;

//클래스를 기반으로 실제 메모리에 만들어진 실체 = 객체 or 인스턴스
public class ClassStart3 {
    public static void main(String[] args) {
        //Student 타입을 받을 수 있는 변수 선언
        Student student1;
        //객체1
        student1 = new Student(); //x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        /* Student student1 = x001; //2. new Student()의 결과로 x001 참조값 반환
        Student student1 = new Student(); //1.Student 객체 생성
        student1 = x001; //3. 최종 결과  */


        //객체2
        Student student2 = new Student(); //x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}
