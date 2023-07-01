package chapter_07;

import chapter_07.camera.Camera;
import chapter_07.camera.FactoryCam;
import chapter_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 🧐 다형성
        /*
        스피드캠과 공장캠은 분명 카메라의 범주 안에 있지만 모든 카메라가 스피드캠이나 공장캠은 아니다.
        상속관계 : IS-A관계 라고 한다.
        */

        // ⭐️ 다른 예제
        /*
        class Person : 사람
        class Student extends Person : 학생 => Student is a Person
        class Teacher extends Person : 선생님 => Student is a Teacher
         */

        //Camera camera = new Camera();
        //FactoryCam factoryCam = new FactoryCam();
        //SpeedCam speedCam = new SpeedCam();
        // 이렇게 IS-A 관계에 있는 상속이라면

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();
        // 이렇게 부모 클래스로 통일해줘도 된다.

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("-----------------------------");

        // 🧐 이점
        // 메소드를 배열로 만들어서 기능을 하나하나 호출하지 않고 반복문으로 한번에 호출 할 수 있다.
        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam :
                cameras) {
            cam.showMainFeature();
        }

        System.out.println("-----------------------------");

        // ⭐️ 자식 클래스의 메소드 호출하기

        // 부모 클래스로 정렬되어 있기 때문에 얘네들은 이렇게 호출할 수 없다!!
        //factoryCam.detectFire();
        //speedCam.checkSpeed();
        //speedCam.recognizeLicensePlate();

        // 형변환을 시키고 해당 클래스의 메소드에 접근 가능하다.
        if (camera instanceof Camera) {
            System.out.println("카메라 입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam) factoryCam).detectFire();
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
        }

        // 🧐 자바는 Object 클래스를 항상 상속하고 있다.
        // 가장 큰 조상이기 때문에 Object 객체에 상속 시킬 수도 있다.
        Object [] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();
    }
}
