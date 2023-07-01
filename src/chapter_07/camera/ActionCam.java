package chapter_07.camera;

public class ActionCam extends Camera {
    public final String lens; // = "광각렌즈"; 1. 선언과 할당 동시에 할 수도 있고 // 값을 못바꾸게 해놨음

    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈"; // 2. 나중에 선언할 수도 있음
    }

    public final void makeVideo(){
        System.out.println(this.name + " : " +  this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
