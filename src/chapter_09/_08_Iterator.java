package chapter_09;

import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        List<String> list = new ArrayList<>(); // List는 인터페이스이기 때문에 다형성에 의해서 list타입으로 객체를 만들 수 있음.

        // 사람을 추가하려 했는데 중간중간 알 수 없는 데이터가 들어갔음!!
        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        // 알수 없음 까지 다 출력해보기
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------------------------------");

        // 이터레이터 사용
        Iterator<String> it = list.iterator();
        // 코드 맨 위로 올라갔다가 프린트 구문을 만나면 하나 씩 출력됨
        System.out.println(it.next()); // 유재석
        System.out.println(it.next()); // (알 수 없음)
        System.out.println(it.next()); // 김종국
        System.out.println(it.next()); // (알 수 없음)

        System.out.println("-------------------------------------");

        // 이터레이터 순회
        it = list.iterator(); // 커서 처음으로 돌리기
        while (it.hasNext()){ // 다음에 가져올 데이터가 있다면 계속 순회하고 없다면 false가 되어서 멈춤
            System.out.println(it.next());
        }

        System.out.println("-------------------------------------");

        // 필요없는 데이터 삭제 해보기
        it = list.iterator();
        while (it.hasNext()){
            String s = it.next(); // 현재 커서의 위치로 부터 다음 데이터를 String으로 반환해줌
            if(s.contains("(알 수 없음")){ // 알수없음 이라는 문자열이 들어가 있다면
                it.remove(); // 삭제
            }
        }

        it = list.iterator(); // 커서 처음으로 돌리기
        while (it.hasNext()){ // 다음에 가져올 데이터가 있다면 계속 순회하고 없다면 false가 되어서 멈춤
            System.out.println(it.next());
        }

        System.out.println("-------------------------------------");

        // set에서도 사용해보기(map도 동일)
        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator<String> itSet = set.iterator();

        while (itSet.hasNext()){
            System.out.println(itSet.next());
        }

        System.out.println("-------------------------------------");

        // Map에서 사용
        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        // map에서는 이터레이터 사용 불가!!
        // 키와 벨류 하나씩 순회해야함
        //  키 순회
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()){
            System.out.println(itMapKey.next());
        }

        System.out.println("-------------------------------------");

        // value 순회
        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()){
            System.out.println(itMapValue.next());
        }

        System.out.println("-------------------------------------");

        // 키와 벨류를 한번에 출력하는 방법
        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()){
            System.out.println(itMap.next());
        }
    }
}
