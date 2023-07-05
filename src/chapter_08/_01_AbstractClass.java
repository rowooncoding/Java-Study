package chapter_08;

import chapter_08.camera.FactoryCam;
import chapter_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 🧐 데이터 추상화 (Data Abstaction)
        // 꼭 필요한 정보만 공개하는 과정!(보여줄건 보여주고 말건 말고)
        // ⭐️ 추상 클래스 (와직 완성되지 않은 클래스, 객체 만들 수 없음!)
        // ⭐️ 추상 메소드 (추상 클래스 또는 인터페이스에서 사용 가능한, 껍데기만 있는 메소드)

        // Camera 추상 클래스 만들었음 클래스 앞에 abstract 붙이면 됨
        // Camera 추상 클래스는 카메라 부품 이걸 통해서 FactoryCam, SpeedCam 이라는 진짜 클래스 만듬
        // 추상 클래스는 객체로 만들 수 없지만 추상 클래스의 자식들은 객체를 만들 수 있음!

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
