package access;

public class Speaker {
    //해당 클래스 내부에서만 사용 가능
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >= 100){
            System.out.println("최대 음량입니다");
        }else{
            volume += 10;
            System.out.println("음량이 10 증가 합니다");
        }
    }
    void volumeDown(){
        volume -= 10;
        System.out.println("volumeDown 호출");
    }
    void showVolume(){
        System.out.println("현재 볼륨: " + volume);
    }
}
