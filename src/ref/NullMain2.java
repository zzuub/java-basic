package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        //null값은 참조할 주소가 존재 x
        data.value = 10;
        System.out.println("data: " + data.value);
    }
}
