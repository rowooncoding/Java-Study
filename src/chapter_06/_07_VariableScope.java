package chapter_06;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class _07_VariableScope {
    public static void mehtodA(){
        // System.out.println(number); error 변수를 이 범위에서는 쓸 수 없다.
    }

    public static void method() {
        int result = 1; // 지역변수
    }
    public static void main(String[] args) {
        // 🧐  변수 스코프의 중요성
        int number = 3;

        // System.out.println(result); error 위와 같다 변수의 스코프를 넘어서 쓸 수 없다.

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i); error! i도 지역변수여서 사용 불가능하다

        {
            int j = 0;
            System.out.println(j);
            System.out.println(number); // 큰 중괄호에 둘러쌓여 있기 때문에 사용 가능하다
        }
        // System.out.println(j); j는 지역변수여서 사용 불가능하다.

    }
}
