package chapter_07;

public class _18_Enum {
    public static void main(String[] args) {
        // 🧐 열거형(상수들의 묶음)
        // 달력 (월)
        // 옷 사이즈
        // OS 종류
        // 해상도 등등


        // ⭐️ 사용법
        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = Resolution.FHD;

        // ⭐️ 사용예제1 (switch case)
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        // ⭐️ 사용예제2
        // 문자열로 부터 값을 가져와서 열거형으로 바꿔준 후 그 값을 출력한다.
        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);

        // ⭐️ 사용예제3 : 열거형에 어떤 요소가 있는지 모를때
        for (Resolution myRes : Resolution.values()){
                System.out.println(myRes.name() + " : " + myRes.ordinal()); // 각각 이름과 순서를 뽑는 것들.
            }

        System.out.println("--------------------------------");

        // 값 가져오기
        for (Resolution myRes : Resolution.values()){
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }
    }
}

// ⭐️ enum 선언 방법
enum Resolution {
    HD(1280), FHD(1920), UHD(3840);

    // 열거형들이 각각의 값을 가지게 하고 싶을 때
    private final int width;
    Resolution(int width){
        this.width = width;
    }

    public int getWidth(){
        return width;
    }
}


