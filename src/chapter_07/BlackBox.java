package chapter_07;

public class BlackBox {
    // 인스턴스 변수
    // 서로 다른 객체에서 서로 다른 값들을 가진다.
    String modelName;
    String resolution;
    int price;
    String color;
    int serialNumber;

    static int counter = 0; // 시리얼 번호 생성해주는 역할(처음엔 0이었다가 1씩 값을 추가하며 생성함)

    // static = 클래스 변수
    // 이 클래스로 만들어지는 모든 객체에 똑같이 적용된다.
    static boolean canAutoReport = false; // 자동 신고 기능

    // ⭐️ 생성자 만들기!!
    BlackBox() {
        System.out.println("기본 생성자 호출️");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 넘버를 발급 받았습니다 : " + this.serialNumber);
    }
    // 생성자 사용해서 변수에 미리 할당하기
    BlackBox(String modelName, String resolution, int price, String color){
        this(); // 기본생성자(여기선 위 먼저 실행되고 밑에꺼 실행된다.)

        System.out.println("기본 생성자 호출️");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }

    // ⭐️ 자동으로 신고하는 기능 메소드로 만들어보기
    void autoReport(){
        if(canAutoReport){
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }else {
            System.out.println("자동 신고기능이 지원되지 않습니다.");
        }
    }

    // ⭐️ 파라미터 받아서 처리하기 -> 메모리 카드 기능
    void insertMemoryCard(int capacity, boolean insert){
        if(insert == true){
            System.out.println("메모리 카드가 삽입되었습니다.");
            System.out.println("용량은 " + capacity + "GB 입니다.");
        }else{
            System.out.println("메모리 카드를 삽입해주세요.");
        }


    }

    // ⭐️ 메모리에 들어있는 동영상을 알려주는 코드
    int getVideoFileCount(int type){
        if (type == 1) { // 일반영상
            return 9; // 임의의 동영상 개수
        } else if (type == 2) { // 이벤트 동영상
            return 1;
        }else {
            return 10;
        }
    }

    // showDateTime : 날짜정보 표시여부
    // showSpeed : 속도정보 표시여부
    // min : 영상 기록 단위(분)
    // 🧐메소드 오버로딩
    void record(boolean showDateTime, boolean showSpeed, int min){
        System.out.println("녹화를 시작합니다.");
        if(showDateTime){
            System.out.println("영상에 날짜 정보가 표시됩니다.");
        }
        if(showSpeed){
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }
    //  메소드 오버로딩 사용해보
    // 이렇게 호출하면 호출할때 인자값이 없더라도 기본값을 포함해서 실행된다.
    void record(){
        record(true, true, 5);
    }

    // 🧐 고객 센터에 전화하는 기능 만들어보기(클래스 메소드)
    static void callServiceCenter(){
        System.out.println("서비스센터(1588-0000) 로 연결합니다.");
        // modelName = 'test'; 스태틱 안에서는 인스턴스 변수수정 불가능함
        // canAutoReport = false; 클래스 변수는 수정 가능
    }

    // 메소드에 새로운 이름을 추가해보자!
    void appendModelName(String modelName) {
        // modelName += modelName; // modelName은 이름이 같다! 최신형 += 최신형임
        this.modelName += modelName; // this : 인스턴스 객체, this.modelName = 인스턴스 변수 modelName(맨위의 것)
    }
}
