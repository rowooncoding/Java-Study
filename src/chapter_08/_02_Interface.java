package chapter_08;

import chapter_08.camera.FactoryCam;
import chapter_08.detector.AdvancedFireDetector;
import chapter_08.detector.Detectable;
import chapter_08.detector.FireDetector;
import chapter_08.reporter.NormalReporter;
import chapter_08.reporter.Reportable;
import chapter_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 🧐 인터페이스
        // 뼈대만 제공하는 구조
        // 단일상속 : extends
        // 여러군데 있는 기능을 상속 : interface

        // Factory 캠과 Speed 캠에 각각 detect와 report메소드 있음
        // 이렇게 겹친 메소드를 interface로 뺄 수 있따.
        // 클래스 만드는것 처럼 만들 되 밑에 interface 클릭해서 만들기.(보통 끝에 able을 붙여서 만든다)
        // 인터페이스는 뼈대만 만들어주고(Reportable 파일) 메소드는 클래스 파일을 하나 더 만들어서 작성한다. 클래스 이름은 끝에 implements를 추가해서 이름을 작성한다.
        // 이렇게 되면 Reportable이라는 인터페이스는 implements Reportable로 만들어진 모든 클래스의 기능들을 다 가지고 있는 것

        // ⭐️ 객체 만들어보기
        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report(); // 일반 화재 신고를 진행합니다.
        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report(); // 직전 30초 영상과 함께 신고를 진행합니다.

        // 이렇게 Reportable 인터페이스로 묶어도 된다.
        //Reportable normalReport = new NormalReporter();
        //Reportable videoReport = new VideoReporter();

        System.out.println("-------------------------");

        // 디텍터 패키지는 반복 학습하기 위한 것
        Detectable fireDetector = new FireDetector();
        fireDetector.detect();
        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("-------------------------");

        // ⭐️ detector랑 report에 만들어놓은 기능을 원래 클래스로 가서 사용해보자!
        // public class FactoryCam extends Camera implements Detectable, Reportable
        // 이렇게 뒤에 implements를 붙이고 만들어둔 인터페이스들을 붙여주면 됨!

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDetector);
        factoryCam.setReporter(normalReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
