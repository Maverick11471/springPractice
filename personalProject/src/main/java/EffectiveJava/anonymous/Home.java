package EffectiveJava.anonymous;

public class Home {

    static RemoteControl remoteControl = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };

    static public void run1(){
        remoteControl.turnOn();
        remoteControl.turnOff();
    }

    static public void run2(){
        RemoteControl remoteControl1 = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨을 끕니다.");
            }
        };
        remoteControl1.turnOn();
        remoteControl1.turnOff();
    }

    static public void run3(RemoteControl remoteControl){
        remoteControl.turnOn();
        remoteControl.turnOff();
    }

    public static void main(String[] args) {
        Home home = new Home();

        home.run1();
        home.run2();

        home.run3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("안녕");
            }

            @Override
            public void turnOff() {
                System.out.println("끄자");
            }
        });
    }


}
