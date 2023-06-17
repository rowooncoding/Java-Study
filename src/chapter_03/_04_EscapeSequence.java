package chapter_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 🧐 특수문자, 이스케이프 문자

        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t : 탭
        System.out.println("해물파전\t\t9000");
        System.out.println("김치전\t\t8000");
        System.out.println("부추전\t\t8000");

        // \\ : \ 역슬래쉬 하나 처리
        System.out.println("C:\\Program Files\\Java"); // C:\Program Files\Java

        // \" : 큰따옴표 출력
        System.out.println("단비가 \"냐옹\"이라고 했어요"); // 단비가 "냐옹"이라고 했어요

        // \' : 작은 따옴표 출력, 큰따옴표 안에 작은 따옴표를 쓸 경우에는 역슬래쉬가 굳이 필요 없다.
        System.out.println("단비가 \'뭘봐?\' 라는 표정을 지었어요"); // 단비가 '뭘봐?' 라는 표정을 지었어요
        System.out.println("단비가 '뭘봐?' 라는 표정을 지었어요"); // 단비가 '뭘봐?' 라는 표정을 지었어요
        // 활용
        char c = 'A';
        c = '\'';
        System.out.println(c); // '
    }
}
