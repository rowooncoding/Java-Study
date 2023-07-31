package chapter_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 🧐 제네릭스
        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("-----------------------------------");

        // 제네릭스는 객체라서 기본 자료형인 int 나 double은 사용불가능하다
        // wrapper class를 이용해야함 Integer, Double 같은 것 (후에 더 자세히 배움)
        // 위는 세개의 메소드 아래는 하나의 메소드
        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // 제네릭스 활용
    private static <T> void printAnyArray(T[] array){
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    // 제네릭스 미활용
    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        
    }
}
