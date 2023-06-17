package chapter_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 🧐 이중 반복문

        // 🧐 별 (*)로 사각형 만들기
        /*
        *****
        *****
        *****
        *****
        *****
         */

        // 코드
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        // 🧐 별 직각 삼각형 만들기
        /*
         *
         **
         ***
         ****
         *****
         */

        // 코드
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        // 🧐 별 직각 삼각형 만들기2
        /*
                ssss*
                sss**
                ss***
                s****
                *****
         */

        // 코드
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
