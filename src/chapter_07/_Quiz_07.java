package chapter_07;

public class _Quiz_07 {
    public static void main(String[] args) {

        /*
        🧐 조건
        1. 햄버거의 종류는 햄버거, 치즈버거, 새우버거 세가지
        2. 각 버거는 각각의 클래스로 생성
        3. 버거 이름을 담기 위한 name 변수 정의
        4. 재료정보를 표시하는 cook() 메소드 정의
        5. 공통 부분은 상속 및 메소드 오버라이딩 처리
        6. 모든 클래스는 하나의 파일에 정의
         */

        /*
        🧐 상속 관계
        햄버거 : 양상추 패티 피클
        치즈버거 : 양상추 패티 피클 + 치즈
        새우버거 : 양상추 패티 피클 + 새우
         */

        // 주어진 코드
        Hamburger[] hamBurgers = new Hamburger[3];
        hamBurgers[0] = new Hamburger();
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");

        System.out.println("-------------------------");

        for (Hamburger hamBurger : hamBurgers) {
            hamBurger.cook();
            System.out.println("-------------------------");
        }
        System.out.println("주문이 완료되었습니다.");
    }
}

class Hamburger {

    public String name;

    public Hamburger(){
        this("햄버거");
    }

    public Hamburger(String name){
        this.name = name;
    }

    public void cook(){
        System.out.println("고기넣음");
        System.out.println("야채넣음");
    }
}

class CheeseBurger extends Hamburger{
    public CheeseBurger(){
        super("치즈버거");
    }

    public void cook(){
        super.cook();
        System.out.println("치즈 넣음");
    }

}

class ShrimpBurger extends Hamburger{
    public ShrimpBurger(){
        super("새우버거");
    }

    public void cook(){
        super.cook();
        System.out.println("새우 넣음");
    }
}