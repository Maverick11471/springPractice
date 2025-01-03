package RemoteControlTest;

public class RemoteControl {

    public class Button implements RemoteControlTest.Button{


        @Override
        public void clickOnAndOff() {

        }

        @Override
        public void mute() {

        }

        @Override
        public void one() {

        }

        @Override
        public void two() {

        }
    }

    Button button = new Button();

    public void setButton(Button button){
        this.button = button;
    }

    public void onClick(){
//        this.button.click();
    }



}
