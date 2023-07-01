package chapter_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        // BlackBox 생성자 안에 있는 내용들 주석 처리 했음!!
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        // 실수로 해상도를 넣지 않았음.
        // b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        // 할인행사

        // 원래 해야할 것.
        // b1.price = b1.price - 5000;

        // 직원 실수
        b1.price = -5000;
        System.out.println(b1.price); // -5000

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution); // null

        System.out.println("---------------------");

        // 🧐 이렇게 문제가 생겼을 때 getter setter 사용한다! 100
        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());
    }
}
