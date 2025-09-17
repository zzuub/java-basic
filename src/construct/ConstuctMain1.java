package construct;

public class ConstuctMain1 {
    public static void main(String[] args) {
        //인스턴스 생성 후 즉시 해당 생성자 호출
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for(MemberConstruct s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
