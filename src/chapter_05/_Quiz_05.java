package chapter_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 내풀이
        int[] shoes = new int[10];

        // 배열 만들기
        for (int i = 0; i < shoes.length; i++) {
            shoes[i] = 250 + (5 * i); // 사이즈가 5단위로 커지는 것을 이용
        }

        // 배열 출력하기
        for (int size :
                shoes) {
            System.out.println("사이즈 " + size + " (재고 있음)");

        }
    }
}
