package chapter_07;

import chapter_07.camera.ActionCam;
import chapter_07.camera.SlowActionCam;

public class _17_final {
    public static void main(String[] args) {
        // 🧐 Final (상수)
        // ActionCam 클래스 만듬~!

        ActionCam actionCam = new ActionCam();
        // actionCam.lens = "표준렌즈";

        actionCam.recordVideo(); // 부모꺼
        actionCam.makeVideo();

        System.out.println("-------------------------");

        // ⭐️ final 사용
        // ActionCam 4번
        // 메소드를 변경하지마!! 하는 경우에는 final 키워드를 넣는다 ActionCam 11번 줄

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();

        // 상속 자체를 못하도록 해보기
        // 부모 컴포넌트를 final로 만든다

    }
}
