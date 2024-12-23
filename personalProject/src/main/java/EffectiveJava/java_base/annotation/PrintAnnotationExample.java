package EffectiveJava.java_base.annotation;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) throws Exception{

        Method[] methods = Service.class.getDeclaredMethods();
        for(Method method : methods){
            PrintAnntation printAnntation = method.getDeclaredAnnotation(PrintAnntation.class);
            printLine(printAnntation);

            method.invoke(new Service());

            printLine(printAnntation);
        }


    }

    public static void printLine(PrintAnntation printAnntation){
        if(printAnntation != null){
            int number = printAnntation.number();
            for(int i = 0 ; i < number ; i++){
                String value = printAnntation.value();
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
