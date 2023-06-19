package chapter_05;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class _01_Array {
    public static void main(String[] args) {
        // 🧐 배열 선언 방법
        // 첫번째
//        String[] coffees = new String[4];
        // 두번째
//        String coffees[] = new String[4]

        // 🧐  배열에 값 넣기
        // 값 넣기
//        coffees[0] = '아메리카노';
//        coffees[1] = '카페모카';
//        coffees[3] = '라떼';
//        coffees[4] = '카푸치코';
        // 바로 넣기
        // String[] coffees = new String[]{"아메리카노", "카페모카", "라떼", "카푸치노"};
        // 바로넣기 2(제일 간편한듯)
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};
        System.out.println(coffees);

        System.out.println("--------------------------------");

        // 🧐 활용 : 커피 주문하기
        System.out.println(coffees[0] + " 하나"); // 아메리카노 하나
        System.out.println(coffees[1] + " 하나"); // 카페모카 하나
        System.out.println("주세요");

        System.out.println("----------------");

        // 🧐 값 변경하기
        coffees[1] = "에스프레소";
        System.out.println(coffees[1]); // 에스프레소
    }
}