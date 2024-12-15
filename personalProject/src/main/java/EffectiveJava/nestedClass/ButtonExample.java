package EffectiveJava.nestedClass;

public class ButtonExample {
    public static void main(String[] args) {

        Button button = new Button();

        class cancelButton implements Button.ClickListener{
            @Override
            public void onClick(){
                System.out.println("취소 하였습니다.");
            }
        }

        button.setClickListener(new cancelButton());

        button.click();
    }
}
