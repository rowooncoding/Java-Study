package chapter_08.detector;

public interface Detectable {
    // 변수를 만든다고 가정하면
    // 자동으로 public static final이 붙는다
    String name = "감지자";

    // 앞에 자동으로 public abstract가 붙는다
    void detect(); // 화재감지
}
