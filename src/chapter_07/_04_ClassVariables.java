package chapter_07;

public class _04_ClassVariables {
    public static void main(String[] args) {
        // 🧐 충돌이 크다면 바로 경찰서에 전화해주는 기능 만들기
        BlackBox b1 = new BlackBox();

        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        // ⭐️ 특정 범위를 초과하는 충돌 감지시 자동 신고기능 개발 여부
        // 개발전
        System.out.println(b1.modelName + " 자동신고기능 " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동신고기능 " + b2.canAutoReport);
        // 스태틱으로 선언된 클래스 변수는 클래스 자체를 적어줘야한다.
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport); // 모든 블랙박스 제품 자동 신고 기능 : false

        // 개발후
        BlackBox.canAutoReport = true;
        System.out.println(b1.modelName + " 자동신고기능 " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동신고기능 " + b2.canAutoReport);
        // 스태틱으로 선언된 클래스 변수는 클래스 자체를 적어줘야한다. 권장 방식임!
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport); // 모든 블랙박스 제품 자동 신고 기능 : true
    }
}
