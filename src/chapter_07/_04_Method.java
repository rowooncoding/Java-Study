package chapter_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.autoReport(); // 지원 안되는 상태

        // 지원하게 해보기
        BlackBox.canAutoReport = true;
        b1.autoReport(); // 지원 됨.

        // 메모리카드 삽입 여부 확인하기
        b1.insertMemoryCard(256, false);

        // 메모리에 있는 영상 개수 반환하기
        // 일반영상 : 1
        // 이벤트 영상 (충돌 감지) : 2
        int fileCount = b1.getVideoFileCount(1); // 일반영상
        System.out.println(fileCount);

        fileCount = b1.getVideoFileCount(2); // 이벤트 영상
        System.out.println(fileCount);
    }
}
