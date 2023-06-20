package chapter_06;

public class _01_Method {
    // 🧐 메소드 만들기
    public static void sayHello(){
        System.out.println("안녕하세요 메소드입니다.");
    }



    public static void main(String[] args) {
        // 🧐 메소드 호출하기
        System.out.println("메소드 호출 전");

        sayHello(); // 안녕하세요 메소드입니다.

        System.out.println("메소드 호출 후");
    }
}
