package chapter_04;

public class _05_for {
    public static void main(String[] args) {
        // 🧐 for 반복문 연습

        // 짝수만 출력하기
        for (int i = 0; i < 10 ; i += 2) {
            System.out.print(i); // 02468
        }

        // 줄바꿈
        System.out.println();

        // 홀수만 출력하기
        for (int i = 1; i < 10; i+=2) {
            System.out.print(i); // 13579
        }

        System.out.println();

        // 거꾸로 숫자
        for (int i = 5; i > 0; i--) {
            System.out.print(i); // 54321
        }

        System.out.println();

        // 0부터 10까지 숫자들의 합
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum); // 55
    }
}
