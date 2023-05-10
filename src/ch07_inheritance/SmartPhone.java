package ch07_inheritance;


public class SmartPhone extends Phone {

    //field
    public boolean wifi;

    //cons - 자동완성 기능에서는 부모클래스의 필드들이 보이지 않는다
    public SmartPhone(String model, String color){
        //super();
        //this.model = model;
        //this.color = color;
        super(model, color);
    }

    public void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }

}
