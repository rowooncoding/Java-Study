package chapter_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = new String[]{"아메리카노", "카페모카", "라떼", "카푸치노"};
        // 🧐 배열 순회하기
        // 몇번째까지 순회할건지 조건 걸 수 있음. break 등등.
        for(int i = 0 ; i < coffees.length ; i ++){
            System.out.println(coffees[i] + " 하나");
        }

        // 🧐 for-each 반복문
        // 무조건 처음부터 끝까지 반복
        for (String coffee : coffees) {
            System.out.println(coffee + " 하나");
        }
    }
}
