package oop1;

public class MusicPlayerData {
    int volume = 0;
    boolean isOn = false;

    void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어 시작");
    }

    void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어 종료");
    }

    void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }
    void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    void showStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }
    }
}
