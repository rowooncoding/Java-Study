package chapter_07;

import chapter_07.camera.FactoryCam;
import chapter_07.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // 🧐 super 부모클래스의 어떤것을 자식클래스가 사용하는것.
        // ⭐️ 사진을 촬영하고 자식의 메소드를 수행하도록 해보자
        // 각각 필요한 메소드를 부모에게 가져와서 메소드 오버라이딩을 하고 원하는 메소드를 그 다음에 실행하도록 적는다. 팩토리캠 : 12 스피드캠 : 11

        // 객체 만들기
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("----------------------");
        speedCam.takePicture();

        // 하지만 이렇게 하면 안돼!!!
        // 부모 클래스에서 메소드 동작을 바꾸거나 추가하면 자식 클래스에서도 바꿔줘야 하기 때문!!
        // FactoryCam 10번줄 확인!!! super은 부모를 뜻한다!
        // 부모에서 protected로 this.name = name으로 인자를 받아주고 public으로 이름을 설정후 자식 클래스들에서 각각 super()로 인자를 주면 직접 접근 하지 않아도 된다.
    }
}
