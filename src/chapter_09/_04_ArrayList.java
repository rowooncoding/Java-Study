package chapter_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크
        // 많은 데이터를 효과적으로 관리에 용이

        // 만들어보기!
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가!!
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회!!
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("------------------------------");

        // 데이터 삭제!!
        System.out.println("신청 학생 수 (데이터 삭제 전)" + list.size());
        list.remove("박명수");
        System.out.println("신청 학생 수 (데이터 삭제 전)" + list.size());
        System.out.println(list.get(3)); // 강호동 // 박명수가 빠지고 강호동이 위로 올라옴

        System.out.println("------------------------------");

        System.out.println("남은 학생수 (제외 전) " + list.size()); // 4
        // 마지막 데이터를 빼준다
        list.remove(list.size() - 1);
        System.out.println("남은 학생수 (제외 후) " + list.size()); // 3

        System.out.println("------------------------------");

        // 순회
        for (String s: list) {
            System.out.println(s);
        }

        System.out.println("------------------------------");

        // 데이터 변경!! (데이터 변경)
        System.out.println("수강권 양도 전 : " + list.get(0));
        list.set(0, "이수근");
        System.out.println("수강권 양도 후 : " + list.get(0));

        System.out.println("------------------------------");

        // 확인!!
        System.out.println(list.indexOf("김종국"));
        // 선착순 5명 내에 포함되었는가?
        // 리스트이름.contains : 값이 포함되었는지 확인하고 포함되었으면 true, 포함되지 않았으면 false
        if(list.contains("김종국")){
            System.out.println("수강 신청 성공");
        }else{
            System.out.println("수강 신청 실패");
        }

        System.out.println("------------------------------");

        // 전체 삭제
        list.clear();
        // 리스트 이름.isEmpty() : 해당 리스트에 값이 있는지 없는지 확인하고 있으면 true, 없으면 false
        if(list.isEmpty()){
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("------------------------------");

        // 다음학기에 새로 공부 시작

        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 출석부 만들기
        // 출석부는 가나다 순으로 만들기 때문에 정렬!
        Collections.sort(list); // 정렬

        for (String s: list) { // 출력
            System.out.println(s);
        }



    }
}
