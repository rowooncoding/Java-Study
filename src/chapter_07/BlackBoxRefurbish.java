package chapter_07;

public class BlackBoxRefurbish {
    public String modelName; // 어디서든지 접근 가능
    String resolution; // default 기본값
    private int price;
    protected String color; // 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능
    // 패키지 08에 00 보기

    // ⭐️ getter setter 빠르게 만들기
    // 원하는 변수 드래그 -> 위의 상태바에 코드 누르기 -> 생성 -> getter와setter 누르기 -> shift누르고 원하는 변수 클릭 -> 확인
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) { //// resolution이라는 변수가 null이거나 빈문자열이면
            return "판매자에게 문의하세요.";
        }
        return resolution; // 해상도에 관한 정보가 없다면 벨리데이션
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price; // 가격을 -5000으로 설정하였기 때문에 최소금액을 설정하면 됨.
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
