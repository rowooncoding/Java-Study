package chapter_07.camera;

public class SpeedCam extends Camera { // 자식 클래스

    // 커맨드 n하면 바로 생성자 만들 수 있음!

    public SpeedCam() {
        super("과속단속 카메라");
    }

    public void takePicture(){
        // 사진 촬영
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed(){
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate(){
        // 번호 인식
        System.out.println("차량 번호를 인식 합니다.");
    }

    @Override // annotation 만약 부모클래스에 override 할수있는 메소드가 있으면 에러가 나옴(심화편에서 자세스)
    public void showMainFeature() {
            System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");

    }
}
