package chapter_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 🧐 접근 제어자
        // 1. private : 해당 클래스 내에서만 접근 가능
        // 2. public : 모든 클래스에서 접근 가능
        // 3. default : (아무것도 적지 않았을 때) 같은 패키지 안에서만 접근 가능(기본)
        // 4. protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능

        // 블랙박스리퍼클래스 만들었음!
        // 클래스 한번에 바꾸기 : 원하는 클래스 드래그 -> 복사 후 커맨드 r -> 원하는 클래스 이름으로 변경 후 모두 바꾸기 혹은 하나씩 바꾸기

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        b1.setPrice(200000);
        b1.color = "블랙";

        // 직원 실수
        b1.setPrice(-5000);
        System.out.println(b1.getPrice()); // -5000

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution); // null

        System.out.println("---------------------");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());

        // 이 가격을 아예 바꿀 수 없게 하려면?
        // b1.price = -5000;
        // BlackboxRefurbish클래스에 가서 변수에 private을 붙여주고 해당 패키지의 변수들을 get과 set이 들어간 변수로 바꿔주면 된다.
    }
}
