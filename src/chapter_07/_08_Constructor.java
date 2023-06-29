package chapter_07;

public class _08_Constructor {
    public static void main(String[] args) {
        // 🧐 생성자 만들기 블랙박스 클래스 15번째 줄
        BlackBox b1 = new BlackBox();
        // 만든 생성자 이용해서 출력하기
        // 장점 : 매번 변수 설정 안해줘도 됨!
        BlackBox b2 = new BlackBox("하양이", "UHD", 300000,"화이트");
        System.out.println(b2.modelName);
//        System.out.println(b2.resolution);
//        System.out.println(b2.price);
//        System.out.println(b2.color);
        System.out.println(b2.serialNumber);


        // 고유한 시리얼 번호 지정하기 블랙박스 클래스 10번 12번 21번
    }
}
