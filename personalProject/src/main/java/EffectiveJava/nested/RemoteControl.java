package EffectiveJava.nested;

public class RemoteControl {

    public static class Button{

        public interface ClickListner{
            void onClick();
        };

        ClickListner clickListner;

        public void setClickListner(ClickListner clickListner){
            this.clickListner = clickListner;
        }

        public void onClick(){
            this.clickListner.onClick();
        }

    }

}
