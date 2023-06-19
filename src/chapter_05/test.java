package chapter_05;

public class test {
    public static void main(String[] args) {
        // 신발 사이즈 만들기
        // 250부터 5사이즈까지 총 10개

        int[] shoes = new int[10];

        for (int i = 0; i < shoes.length; i++) {
            shoes[i] = 250 + (5 * i);
        }

        for (int i = 0; i < shoes.length; i++) {
            System.out.println("사이즈 " + shoes[i] + " (재고있음)");
        }


    }
}

