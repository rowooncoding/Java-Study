package chapter_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 🧐 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        // 같으면 true 다르면 false
        System.out.println(s1.equals(s2)); // false
        // 대소문자 구분없이 문자열 내용 비교
        System.out.println(s2.equalsIgnoreCase("python")); // true

        // 🧐 문자열 비교 심화
        // "1234" 를 s1과 s2가 참조하는 것
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true, 내용 비교
        System.out.println(s1 == s2); // true, 참조 비교

        // "1234"는 서로 다른 것
        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true, 내용 비교
        System.out.println(s1 == s2); // false, 참조 비교
    }
}
