package chapter_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 🧐산술연산자

        // 일반 연산
        System.out.println(5 / 2); // 2, 슬래쉬 하나는 나머지 버리고 정수만 남는다.
        System.out.println(4 % 2); // 0, 나머지 남는다.

        // 증감 연산
        int val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11 먼저 더하고 코드 수행
        System.out.println(val); // 11

        int val2 = 10;
        System.out.println(val2); // 10
        System.out.println(val2++); // 10 코드 수행하고 더함
        System.out.println(val2); // 11
    }
}
