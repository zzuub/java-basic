package construct;

public class ConstuctMain2 {
    public static void main(String[] args) {
        //성적 입력이 꼭 필요한 경우 : grade가 있는 생성자 호출
        //그렇지 않은 경우 : grade가 없는 생성자 호출
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16);

        MemberConstruct[] members = {member1, member2};

        for(MemberConstruct s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
