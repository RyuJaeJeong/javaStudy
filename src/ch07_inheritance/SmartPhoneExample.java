package ch07_inheritance;


public class SmartPhoneExample {

    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "검은색");

        //phone으로 부터 상속받은 field
        System.out.printf("모델 : %s\n", myPhone.model);
        System.out.printf("색상 : %s\n", myPhone.color);

        //smartPhone의 필드
        System.out.printf("와이파이 상태 : %s\n", myPhone.wifi);
        
        //Phone으로부터 상속받은 메소드 호출
        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요! 저는 류재정인데요");
        myPhone.sendVoice("아~ 네 반갑습니다.");
        myPhone.hangUp();

        //SmartPhone 메소드 호출
        myPhone.setWifi(true);
        myPhone.internet();
    
    }


}
