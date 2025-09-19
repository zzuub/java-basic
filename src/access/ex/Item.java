package access.ex;

public class Item {
    String name;
    int amt;
    int cnt;

    Item(String name, int amt, int cnt) {
        this.name = name;
        this.amt = amt;
        this.cnt = cnt;
    }

    String getName(){
        return name;
    }

    int getTotalPrice(){
        return amt * cnt;
    }
}
