package chapter_08.camera;

public class FactoryCam extends Camera{
    // 여기선 메소드를 구현 해야함 함! 안그러면 에러 !
    @Override
    public void showMainFeature() {
        System.out.println("화재 감듬");
    }

    public void detect(){
        System.out.println("화재를 감지합니다.");
    }

    public void report(){
        System.out.println("화재 신고를 진행합니다.");
    }
}
