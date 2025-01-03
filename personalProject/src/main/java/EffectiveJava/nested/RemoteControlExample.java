package EffectiveJava.nested;

import EffectiveJava.nestedClass.C;

public class RemoteControlExample {

    static RemoteControl.Button remoteControl = new RemoteControl.Button();

    public static void main(String[] args) {

        class OkListner implements RemoteControl.Button.ClickListner{

            @Override
            public void onClick() {
                System.out.println("Ok");
            }
        }

        remoteControl.setClickListner(new OkListner());

        remoteControl.onClick();

        class CancelListenr implements RemoteControl.Button.ClickListner{

            @Override
            public void onClick() {
                System.out.println("Cancel");
            }
        }

        remoteControl.setClickListner(new CancelListenr());

        remoteControl.onClick();

    }

};


