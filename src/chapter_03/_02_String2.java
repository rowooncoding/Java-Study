package chapter_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 🧐 문자열 변환

        //  and를 ,로 변환
        System.out.println(s.replace(" and", ",")); // I like Java, Python, C.

        // 잘라내기
        // index 기준 7부터 시작해서 출력 (이전내용 삭제)
        System.out.println(s.substring(7)); // Java and Python and C.
        System.out.println(s.substring(s.indexOf("Java"))); // Java and Python and C.
        // 해당 글자 시작해서 끝 위치 직전까지 잘라낸다.
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // Java and Python and C

        // 공백 제거
        s = "                  I love you     ";
        System.out.println(s); //                   I love you
        System.out.println(s.trim()); // I love you

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.concat(",").concat(s2)); // Java,Python
    }
}
