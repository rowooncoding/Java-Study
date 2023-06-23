package chapter_07;

public class _01_Class {
    public static void main(String[] args) {
        // 🧐 객체지향 프로그래밍(OOP)
        // 유지보수 용이
        // 높은 재사용성

        // ⭐️ 차량용 블랙박스
        // 모델명, 해상도, 가격, 색상
        // 우리가 만든 첫번째 제품
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";

        // 새로운 제품 개발
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        // 또다른 제품을 개발?
        // 변수도 많고 귀찮아...
        // 객체로 만들자!
        BlackBox bbox = new BlackBox();
        BlackBox bbox2 = new BlackBox();
        // BlackBox라는 클래스로 부터 bbox라는 객체를 생성했고 이때 bbox라는 객체는 인스턴스 라고 한다.
    }
}
