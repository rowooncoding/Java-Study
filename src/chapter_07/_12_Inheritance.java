package chapter_07;

import chapter_07.camera.Camera;
import chapter_07.camera.FactoryCam;
import chapter_07.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 🧐 상속
        // 카메라 패키지 하나 만들었음! 안에 세개 클래스!

        // 클래스 세개 만든거 객체로 만들기
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        // 세개의 객체에 대해서 이름 정보 출력하기
        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        // 사진 촬영 해보기
        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        // ⭐️ 상속의 이점
        // 이렇게 공통 클래스들이 있고 각각 다른 클래스를 추가해야할 때 상속을 사용하면 편리하다
        // 추가할게 없는 Camera 클래스는 부모 클래스가 되는것이고 나머지는 Camera클래스가 가지고 있는 메소드들에 추가한 것들을 가지고 있으니까 자식이 된다.
        // 자식 클래스로 만드는 방법 : extends 부모 클래스 이름
        // 공통 메소드들 지우기

        // ⭐️ 카메라 특수 기능 써보기
        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}
