package chapter_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // 🧐 다차원 배열 순회
        // 너비 높이가 일정한 2차원 배열
        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(seats[i][j] + " ");
            }
            /*
            A1 A2 A3 A4 A5
            B1 B2 B3 B4 B5
            C1 C2 C3 C4 C5
             */
            System.out.println();
        }

        System.out.println(" ------------------------ ");

        // 너비 높이가 다른 2차원 배열
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", " B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.print(seats2[i][j] + " "); // 각각 행 index에 해당하는 요소들 모두 끄집어 내버리기
            }
            /*
            A1 A2 A3
            B1 B2 B3  B4
            C1 C2 C3 C4 C5
             */
            System.out.println();
        }

        System.out.println("-----------------------");

        // 🧐 다차원 배열 초기화 해보기
        // 세로 크기 10, 가로크기 15 즉 10X15인 영화관 좌석만들기 -> 2차원 배열 만들기
        String[][] seats3 = new String[10][15];
        String[] eng = {"A","B","C","D","E","F","G","H","I","J"};

        for (int i = 0; i < seats3.length; i++) { // 세로의 길이 (10)만큼 반복
            for (int j = 0; j < seats3[i].length; j++) { // seats3의 인덱스 각각의 길이 = 가로의 길이 = 15만큼 반복
                seats3[i][j] = eng[i] + (j + 1);
                // 의자 번호 몇행 몇열은 영어 숫자와 배열의 index +1 로 이루어진다 1부터 시작하지 않으면 첫줄이 0이 됨
            }
        }

        // 표구매
        seats3[7][8] = "__";
        seats3[7][9] = "___";

        // 영화관 좌석 번호 확인하기
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + (j + 1);
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}