package chapter_07;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();

        // 메소드에 새로운 이름을 추가해보자!
        b1.modelName = "까망이"; // 까망이(최신형)
        b1.appendModelName("(최신형)");
        System.out.println(b1.modelName);
    }
}

