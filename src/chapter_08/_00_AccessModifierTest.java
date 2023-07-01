package chapter_08;

import chapter_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public 사용가능!
        // b1.resolution = 'FHD'; // defualt 사용 불가능!
        // b1.price = 200000; // private 라서 사용 불가능!!
        // b1.color = "블랙"; // protected 사용 불가능!!
    }
}
