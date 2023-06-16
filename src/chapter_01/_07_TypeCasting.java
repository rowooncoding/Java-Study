package chapter_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting

        // 🧐 형변환 활용하기
        // 정수 -> 실수
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        // 실수 -> 정수
        float score_f = 93.3f;
        double score_d = 98.8;
        System.out.println((int) score_f); // 93
        System.out.println((int) score_d); // 98

        // 정수 + 실수
        score = 93 + (int)98.8; // 93 + 98 = 191
        System.out.println(score); // 191

        score_d = 93 + 98.8; // 자동으로 double 자료형으로 변환해준다.
        System.out.println(score_d); // 191.8

        // 🧐 변수에 형 변환 된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0 으로 자동 형 변환

        // 🧐 정리
        // int -> long -> float -> double (자동 형변환)

        // 🧐 숫자를 문자로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 🧐 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);
    }
}
