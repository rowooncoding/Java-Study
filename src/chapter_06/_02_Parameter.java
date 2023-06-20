package chapter_06;

public class _02_Parameter {

    // 🧐 인자가 한개인 메소드
    // 숫자 제곱하기
    public  static  void power (int number) {
        int result = number * number;
        System.out.println(result);
    }

    // 🧐 인자가 두개인 메소드
    // n의 n승을 해주는 코드 만들기
    public  static void powerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * number;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        // 🧐 파라미터
        // 2 => 2 * 2 = 4
        // 3 => 3 * 3 = 4
        power(2); // 4
        power(3); // 9

        powerByExp(2,3); // 8
    }
}
