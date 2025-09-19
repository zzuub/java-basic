package access.ex;

public class MaxCounter {
    int count = 0;
    int max;

    MaxCounter(int max) {
        this.max = max;
    }

    void increment(){
        if(max > count){
            count++;
        } else {
            System.out.println("최대값을 초과할 수 없습니다");
            return;
        }
    }

    int getCount(){
        return count;
    }
}
