package chapter_07.camera;

public class SlowActionCam extends ActionCam {
    public SlowActionCam() {
        this.name = "슬로우 액션 카메라"; // ActionCam 에는 이 메소드가 없어서 그냥 조상에 접근함
    }
}
