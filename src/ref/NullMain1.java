package ref;

public class NullMain1 {
    public static void main(String[] args) {
        //참조형 변수  data 생성, 아직 가리키는 객체 x
        Data data = null;
        System.out.println("1.data = " + data);
        //새로운 Data 객체 생성 -> 참조값 data 변수에 할당, 참조할 객체 존재 o
        data = new Data();
        System.out.println("2.data = " + data);
        //data에 다시 null 할당, 앞서 만든 Data 인스턴스 참조 x
        data = null;
        System.out.println("3.data = " + data);
    }
}
