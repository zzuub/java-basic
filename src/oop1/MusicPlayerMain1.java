package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        //음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어 시작");

        //볼륨증가
        volume++;
        System.out.println("볼룸: " + volume);

        //볼륨감소
        volume--;
        System.out.println("볼룸: " + volume);

        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인: ");
        if(isOn){
            System.out.println("음악 플레이어 On, 볼륨: " + volume);
        }else{
            System.out.println("음악 플레이어 Off");
        }

        //음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어 종료");
    }
}
