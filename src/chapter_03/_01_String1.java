package chapter_03;

import java.util.Locale;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 🧐 문자열의 길이
        System.out.println(s.length()); // 29

        // 🧐 대소문자 변환
        // 대문자 변환
        System.out.println(s.toUpperCase()); // I LIKE JAVA AND PYTHON AND C.
        // 소문자 변환
        System.out.println(s.toLowerCase()); // i like java and python and c.

        // 🧐 포함 관계
        System.out.println(s.contains("Java")); // true
        // 위치정보
        System.out.println(s.indexOf("Java")); // 7, 포함되지 않으면 -1, 처음으로 나오는 위치를 찾는다
        // 마지막에 있는 글자
        System.out.println(s.lastIndexOf("and")); // 23, 마지막에 일치하는 정보 출력
        // 내가 원하는 문장이 맞는지 확인하기
        System.out.println(s.startsWith("I like")); // true, 해당 문자열로 시작하는가.
        System.out.println(s.endsWith(".")); // true, 해당 문자열로 끝나는가
    }
}
