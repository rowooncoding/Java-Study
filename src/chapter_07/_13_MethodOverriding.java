package chapter_07;

import chapter_07.camera.Camera;
import chapter_07.camera.FactoryCam;
import chapter_07.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 🧐 메소드 오버라이딩 : 자식 클래스에서 부모 클래스의 메소드를 덮어 쓰기(재정의)
        // 카메라 클래 21번 줄
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature(); // 공장 카메라의 주요 기능 : 사진촬영, 동영상 녹화 + 화재감지까지 들어가게 하고 싶음
        speedCam.showMainFeature(); // 과속단속 카메라의 주요 기능 : 사진촬영, 동영상 녹화 + 차량번호인식, 속도측정 까지 들어가게 하고싶음

        // 하는법 : 해당 메소드를 자식 메소드에 붙여넣기 하고 내용을 알맞게 변환하면됨.
        // 아니면 메소드 이름을 자식한테 가서 쓰면 밑에 더보기로 하면됨.

    }
}
