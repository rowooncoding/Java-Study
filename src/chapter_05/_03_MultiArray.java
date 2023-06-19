package chapter_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 🧐 다차원 배열 (2차원 배열)
        // 1차원 : 선, 2차원 면

        // 소규모 영화관 좌석
        // A1 - A5
        // B1 - B5
        // c1 - C5

        // 1차원 배열로 만들기
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 2차원 배열로 만들기 3x5크기의 2차원 배열
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // 🧐 활용
        // B2에 접근하려면?
        System.out.println(seats[1][1]); // B2

        // 🧐 길이가 다른 2차원 배열
        String[][] seats2 ={
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", " B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        // A3 에 접근하려면?
        System.out.println(seats[0][2]); // A3

    }
}
