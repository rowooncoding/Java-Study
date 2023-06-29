package chapter_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        // 🧐 고객 센터에 전화하는 기능 만들어보자
        b1.callServiceCenter();

        // 클래스 이름으로 바로 접근 가능 객체 안만들어도 댐!!
        BlackBox.callServiceCenter();

    }
}
