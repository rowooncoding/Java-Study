package chapter_06;

public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number
    }

    // ⭐️ 문자를 넣어도 숫자로 변환해서 제곱을 해주는 메소드
    public static int getPower(String StrNumber) {
        int number = Integer.parseInt(StrNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 🧐 메소드 오버로딩
        // 같은 이름으로 메소드를 만든는것
        // 조건 : 전달값의 타입이 다르거나, 전달값의 갯수가 달라야 가능함, 메소드 자체의 타입이 다르면 오버로딩 불유
        System.out.println(getPower(3)); // 9
        System.out.println(getPower("3")); // 9
        System.out.println(getPower(3,3)); // 27
    }
}
