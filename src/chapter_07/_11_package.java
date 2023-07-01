package chapter_07;

import java.util.Random;

public class _11_package {
    public static void main(String[] args) {
        // 🧐 패키지
        // 자바 클래스들을 비슷한 것들 끼리 모아두는 폴더 같은

        // ⭐️ import : 다른 패키지에 있는 클래스를 사용할게요!
        // ex) chapter_07.BlackBox; : chapter_07에 있는 BlackBox 클래스를 가져다 쓸래
        // ex) chapter_07.*; : chapter_07에 있는 모든 클래스를 가져다 쓸래

        // 🧐 랜덤 클래스 : 말그대로 랜덤한 어떤 것을 추출해주는 클래스
        Random random = new Random();
        System.out.println(random.nextInt()); // int의 범위 내에서 정수형 값 반환
        System.out.println(random.nextInt(10)); // 0이상 10미만 정수형 값 반환
        System.out.println(random.nextDouble()); // 0.0이상 1.0미만의 실수 값

        // System.out.println(random.nextDouble(10.0)); nextDouble은 범위를 따로 지정할 수 없다!!
        // ⭐️ 만약에 범위가 있는 실수 값을 뽑고 싶다면? 꿀팁!
        double min = 5.0;
        double max = 10.0;
        System.out.println(min + (max - min) * random.nextDouble());

        System.out.println(random.nextBoolean()); // 랜덤 불리언 값을 뽑는다.

        // ⭐️ 로또 번호를 랜덤으로 뽑으려면?? 1부터 45이하
        System.out.println(random.nextInt(45) + 1);

        // 구글에서 자바 클래스를 겁색해서 그 때 그때 쓰자!!
    }
}
