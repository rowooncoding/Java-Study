package chapter_06;

public class _06_WhenToUse {

    public static int getPower(int number) {
        // 주석 삭제 가능하다
        // int result = number * number;
        // return result;
        // ⭐️ 만약 제곱 한번이 필요하다면 인자를 하나 넣으면 되고 두개를 넣고싶다면 두개를 넣으면 된다.
        return getPower(number , 2);
    }
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;

    }

    public static void main(String[] args) {
        // 🧐 메소드가 필요한 이유

        // 2의 2승을 구하기
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result); // 4

        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result); // 27

        // 이렇게 비슷한 기능을 많이 만들어야 한다면? -> 메소드를 사용하자.

        System.out.println( getPower(2, 2)); // 4
        System.out.println(getPower(3, 3)); // 27


    }
}
