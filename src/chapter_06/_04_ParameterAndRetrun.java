package chapter_06;

public class _04_ParameterAndRetrun {

    // ⭐️ return 과 인자가 있는 메소드 만들어보기.
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 🧐 반환값과 전달값이 같이 있는 메소드 호출하기

        int retVal = getPower(2);
        System.out.println(retVal); // 4

        retVal = getPower(3);
        System.out.println(retVal); // 9

        retVal = getPowerByExp(3,3);
        System.out.println(retVal);
    }
}
