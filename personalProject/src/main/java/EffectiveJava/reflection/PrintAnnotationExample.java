package EffectiveJava.reflection;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) throws Exception{


        Method[] clazz = Service.class.getDeclaredMethods();

        for(Method method : clazz){
            PrintAnnotaition printAnnotaition = method.getAnnotation(PrintAnnotaition.class);
            printLine(printAnnotaition);
            method.invoke(new Service());
        }

    }

    public static void printLine(PrintAnnotaition printAnnotaition){
        if(printAnnotaition != null){
            int number = printAnnotaition.number();
            for(int i = 0 ; i < number ; i++){
                System.out.print(printAnnotaition.value());
            }
            System.out.println();
        }
    }


}
