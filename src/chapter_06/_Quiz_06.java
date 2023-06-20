package chapter_06;

public class _Quiz_06 {
    public static String getHiddenData(String data, int index) {
        // 전달받은 데이터에서 해당 index 까지만 잘라서 저장하기
        String hiddenData = data.substring(0, index);
        // 전체 length 에서 index를 빼기
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 " + getHiddenData(name, 1));
        System.out.println("주민등록번호 " + getHiddenData(id, 8));
        System.out.println("전화번호 " + getHiddenData(phone, 9));


    }
}
