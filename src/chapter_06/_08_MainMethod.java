package chapter_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        // 🧐 메인 메소드
        // 지금까지 써왔던 main은 하나의 메소드이다.
        for (String s :
                args) {
            System.out.println(s);
        }

        // ⭐️ 도서 콜센터 프로그램 만들기
        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        if(args.length == 1){ // 전달받은 값이 1개 -> 사용자가 어떤 메뉴를 선택함
            switch (args[0]){
                case "1" :
                    System.out.println("도서 조회 메뉴입니다");
                    break;
                case "2" :
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "3" :
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
            }
        } else {
            System.out.println("(사용법) 1에서 3 메뉴중 하나를 선택하세요");
        }
    }
}
