package chapter_01;

public class _04_variables {
    public static void main(String[] args) {
        String name; // 변수 선언 문자 타입은 String
        name = "이로운"; // 할당

        // 문자형
        String name2 = "나도코딩"; // 여러 글자를 작성할때는 큰 따움표
        char grade = 'A'; // 한글자를 작성할때는 작은 따옴표
        name = "강백호"; // 재할당

        // 숫자형
        int hour = 15; // 정수 숫자 타입은 int
        long l = 10000000000000L; // 어어어어엄청 큰 숫자를 넣을때는 long
        long l2 = 10_000_000_000_000L; // 이렇게 적어도 됨.
        double score = 90.5; // 실수 숫자 타입은 double
        double d = 3.14; // double 변수 뒤에는 실수 뒤에 아무것도 안적어도 괜찮지만
        float f = 3.14F; // float 뒤에는 f를 붙여줘야한다.

        // 불리언 형
        boolean pass = true; // 불리언은 boolean
        boolean noPass = false; // 불리언은 boolean

        // 변수 활용
        System.out.println(name + "님, 배송이 시작 되었습니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님의 평균 점수는 "+ score + "점 입니다.");
        System.out.println("학점은 " + grade + "입니다.");
        System.out.println("이번 시험에 합격 했을까요? " + pass);

    }
}
