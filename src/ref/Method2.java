package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 16, 80);
        Student student2 = createStudent("학생2", 18, 70);

        printStudent(student1);
        printStudent(student2);
    }
    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void printStudent(Student student){
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 점수:" + student.grade);
    }

}
