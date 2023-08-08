package chapter_09;

import chapter_09.coffee.*;
import chapter_09.user.User;
import chapter_09.user.VipUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 🧐 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("---------------------------------");

        // 두개의 클래스는 사실 기능이 같다
        // 하지만 타입이 바뀐다면 바뀐 타입에 맞춰서 하나하나 class를 만들어야한다.
        // 첫번째 방법: Object 클래스로 필드변수를 만든다

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("---------------------------------");
        // 하지만 Object 타입이 아닌 값을 가져오려고 하면 형변환이 필요하다
        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        // 하지만 이것도 정수를 String 으로 가져오려고 하면 문제가 생긴다
        // c4Name 은 String 타입
        // c3.name 은 int 타입인데 String으로 바꾸려고 하면 에러가 생긴다
        // c4Name = (String) c3.name;

        System.out.println("---------------------------------");

        // 제네릭 클래스 만들기
        // 레퍼런스 타입에 따라서 값을 넣어야한다
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        // 값을 변환하지 않고 바로 넣을 수 있음
        int c5Name = c5.name;
        System.out.println("주문고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문고객 이름 : " + c6Name);

        System.out.println("---------------------------------");

        // ⭐️ 제너릭 클래스 이용 사용자가 직접 커피 주문을 하도록 만들기
        // 타입을 정해줄 수 있다.
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VipUser("서장훈"));
        c8.ready();
    }
}
