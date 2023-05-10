package ch07_inheritance;

public class Computer extends Calculator {

    //method
    //인텔리제이의 경우 crtl + o버튼을 통해 override method를 자동생성 할 수 있다.
    @Override
    public double areaCircle(double r) {
        System.out.printf("Computer 객체의 areaCircle() 실행\n");
        return Math.PI * r * r;
    }
}
