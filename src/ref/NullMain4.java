package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); //참조할 곳 생성
        System.out.println("bigData.count= " + bigData.count);
        System.out.println("bigData.data= " + bigData.data);
        System.out.println("bigData.data.value= " + bigData.data.value);

    }
}
