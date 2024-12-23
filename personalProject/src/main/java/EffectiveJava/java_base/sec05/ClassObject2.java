package EffectiveJava.java_base.sec05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassObject2 {
    public static void main(String[] args) {

        Class clazz = ClassObjectMember.class;

        System.out.println("[필드 정보]");
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            System.out.print(field.getType().getSimpleName() + " " + field.getName());
            System.out.println();
        }

        System.out.println("[생성자 정보]");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            System.out.print(constructor.getName() + "(");
            printParameters(constructor.getParameterTypes());
            System.out.println(")");
        }

        System.out.println("[메서드 정보]");
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods){
            System.out.print(method.getName() + "(");
            printParameters(method.getParameterTypes());
            System.out.println(")");
        }

//        System.out.println(clazz.getResource("타이틀1.jpeg").getPath());
        System.out.println(clazz.getResource("/EffectiveJava/java_base/sec05/타이틀1.jpeg").getPath());


    }

    private static void printParameters(Class[] parameters){
        for(int i = 0; i<parameters.length; i++){
            System.out.print(parameters[i].getSimpleName());
            if(i<parameters.length-1){
                System.out.print(", ");
            }
        }
    }




}
