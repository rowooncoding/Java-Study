package chapter_01;

public class _03_Comment {
    public static void main(String[] args) {
        System.out.println("(10분 전) 잠시 후 결혼식 시작 예정이오니 착석 부탁드립니다.");
        // 📋 주석처리하기
        // System.out.println("(5분 전) 잠시 후 결혼식 시작 예정이오니 착석 부탁드립니다.");
        System.out.println("지금부터 결혼식을 시작하겠습니다.");

        // 📋 주석 활용하기
        int size = 120;
        size = size + 10; // 어린이는 발이 빨리 자라기 때문에 사이즈 10만큼 더 큰 신발을 구매함.
        System.out.println("신발 사이즈 " + size + "으로 보여주세요.");

        // 📋 여러줄에 대한 주석
        /*
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        */

        // 📋 주석 단축키
        // 한줄 : cmd + /
        // 여러줄 : 드래그 후 cmd + shift + /
    }
}
