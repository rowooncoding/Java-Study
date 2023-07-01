package chapter_07;

import chapter_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 🧐 참조
        // 기본 자료형 : int, float, double, long, boolean, ...
        // 기본값 가지고 있음
        // 메소드 가지고 있지 않음
        // 소문자로 시작
        int[] i = new int[3];
        System.out.println(i[0]); // 0

        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형 : String, 사용자정의로 만들어진 객체들(우리가 만든거)
        // 내용이 없다면 null
        // 메소드 가지고 있음
        // 대문자로 시작
        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // true

        System.out.println("-----------------------------");

        // 🧐 그래서 어쩌라는건지
        int a = 10;
        int b = 20;

        b = a;
        System.out.println(a); // 10
        System.out.println(b); // 10

        b = 30;
        System.out.println(a); // 10
        System.out.println(b); // 30

        // 기본자료형 :  서로 별도로 움직임

        System.out.println("-----------------------------");

        Camera c1 = new Camera();
        Camera c2 = new Camera();

        c1.name = "카메라1";
        c2.name = "카메라2";

        System.out.println(c1.name); // 카메라1
        System.out.println(c2.name); // 카메라2

        c2 = c1;
        System.out.println(c1.name); // 카메라1
        System.out.println(c2.name); // 카메라1

        c2.name = "고장난 카메라";
        System.out.println(c1.name); // 고장난 카메라
        System.out.println(c2.name); // 고장난 카메라

        // 참조 자료형 :  값이 동시에 바뀐다 => 참조하고 있기 때문에

        System.out.println("-----------------------------");

        changeName(c2);
        System.out.println(c1.name); // 잘못된 카메라
        System.out.println(c2.name); // 잘못된 카메라

        System.out.println("-----------------------------");

        // ⭐️ 참조 관계를 끊고 싶다면?
        c2 = null;

    }
    // ⭐️ 참조의 활용
    public static void changeName(Camera camera){
        camera.name = "잘못된 카메라"; // 첫번째 풍선도 바꿔버림
    }
}
