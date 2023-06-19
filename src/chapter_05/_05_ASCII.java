package chapter_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 🧐 아스키코드 (ANSI) = 미국 표준 코드
        char c = 'A';
        System.out.println(c); // A
        System.out.println((int)c); // 65

        c = 'B';
        System.out.println(c); // B
        System.out.println((int)c); // 66

        c++;
        System.out.println(c); // C
        System.out.println((int)c); // 67

        // 🧐 다차원 배열 아스키 코드로 다시 만들어보기
        // 세로 크기 10, 가로크기 15 즉 10X15인 영화관 좌석만들기 -> 2차원 배열 만들기
        String[][] seats3 = new String[10][15];
        char ch = 'A'; // 아스키코드 넣기
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (i + 1); // 아스키 코드를 문자열로 바꿔서
            }
            ch++;
        }

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
