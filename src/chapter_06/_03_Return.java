package chapter_06;

public class _03_Return {
    // ⭐️ 특정 호텔 정보 만드는 프로그램
    // 호텔 전화번호
    // void -> 반환값이 없는 메소드, 만약 반환값이 있다면 그 자료형을 적어줘야함.
    public static String getPhoneNumber(){
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }
    // 호텔 주소
    public static String getAdress(){
        return "서울시 어딘가";
    }

    // 호텔 액티비티
    public static String getActivity() {
        return "볼링장, 탁구장, 노래방";
    }


    public static void main(String[] args) {
        // 🧐 반환값
        // 호텔 전화번호
        String contactNumber = getPhoneNumber();
        System.out.println(contactNumber);

        // 호텔 주소
        String adress = getAdress();
        System.out.println(adress);

        // 호텔 엑티비티
        System.out.println(getActivity());
    }
}
