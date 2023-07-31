package chapter_08.camera;

import chapter_08.detector.Detectable;
import chapter_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {

    // 인터페이스 변수 정의
    private Detectable detector;
    private Reportable reporter;

    // 변수 정의 해둔것 setDetector로 수정!
    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    // 여기선 메소드를 구현 해야함 함! 안그러면 에러 !
    @Override
    public void showMainFeature() {
        System.out.println("화재 감듬");
    }


    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
