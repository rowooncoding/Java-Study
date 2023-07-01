package chapter_07.camera;

public class Camera { // 부모 클래스
    public String name;

    // 생성자 만들기
    public Camera() {
        this.name = "카메라";
    }

    public void takePicture(){
        // 사진 촬영
        System.out.println(this.name + " : 사진을 촬영합니다.");
    }

    public void recordVideo(){
        // 동영상 녹화
        System.out.println(this.name + " : 동영상을 녹화합니다");
    }
}
