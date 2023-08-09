package chapter_09;


import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵(key, value)
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        // key : 유재석, value : 10
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        System.out.println("총 고객 수 : " + map.size());

        System.out.println("--------------------------------");

        // 조회
        System.out.println("유재석님의 포인트 : " + map.get("유재석"));
        System.out.println("박명수님의 포인트 : " + map.get("박명수"));

        System.out.println("--------------------------------");

        // 확인
        if(map.containsKey("서장훈")){ // 서장훈이 map에 있다면
            int point = map.get("서장훈"); // get으로 서장훈의 포인트를 가져오고
            map.put("서장훈", ++point); // ++point로 값을 더해주고 나서 put으로 다시 넣어준다
            System.out.println("서장훈님의 누적 포인트 : " + map.get("서장훈"));

        }else{
            // 서장훈이 처음 왔을 때
            map.put("서장훈", 1); // 서장훈 key로 1점 추가
            System.out.println("서장훈님 신규 등록 (포인트 1)");
        }

        System.out.println("--------------------------------");

        // 삭제
        map.remove("유재석");
        System.out.println(map.get("유재석")); // key가 없을 때는 null 반환함

        System.out.println("--------------------------------");

        // 전체삭제
        map.clear();
        if(map.isEmpty()){
            System.out.println("남은 고객 수 : " + map.size());
            System.out.println("가게 폐업");
        }

        System.out.println("--------------------------------");

        // 다시 찾아온 고객들
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        // key 확인
        for(String key : map.keySet()){
            System.out.println(key);
        }

        System.out.println("--------------------------------");

        // Value 확인
        for(int value : map.values()){
            System.out.println(value);
        }

        System.out.println("--------------------------------");

        // key value 함께 확인
        for(String key : map.keySet()){
            System.out.println("고객 이름 : " + key + "\t포인트 : " + map.get(key));
        }

        System.out.println("--------------------------------");

        // 맵 : 중복 x , 순서 x
        map.put("김종국", 10);
        map.put("김종국", 30);
        map.put("김종국", 50);
        // 중복 허용한다면 김종국이 세번 들어갈듯

        for(String key : map.keySet()){
            System.out.println("고객 이름 : " + key + "\t포인트 : " + map.get(key));
        }

        /*
        고객 이름 : 박명수	포인트 : 5
        고객 이름 : 서장훈	포인트 : 15
        고객 이름 : 유재석	포인트 : 10
        고객 이름 : 김종국	포인트 : 50
        */

        // 김종국 하나밖에 안들어감

        System.out.println("--------------------------------");

        // 순서 보장하고 싶다면?
        // linkedHashMap 쓰면 됨

    }
}
