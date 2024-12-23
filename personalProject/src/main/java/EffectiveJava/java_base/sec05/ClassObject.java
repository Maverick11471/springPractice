package EffectiveJava.java_base.sec05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassObject  {

    public static void main(String[] args){

        try{
            Class clazz = ClassObjectMember.class;

            Class clazz2 = Class.forName("EffectiveJava.java_base.sec05.ClassObjectMember");

            ClassObjectMember classObjectMember = new ClassObjectMember();
            Class clazz3 = classObjectMember.getClass();

            System.out.println(clazz);
            System.out.println(clazz2);
            System.out.println(clazz3);

            System.out.println(clazz.getPackage().getName());
            System.out.println(clazz2.getSimpleName());
            System.out.println(clazz3.getName());

            System.out.println("[패키지 정보]");
            Constructor[] constructors = clazz.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                System.out.print(constructor.getName() + "(");
                printParameters(constructor.getParameterTypes());
                System.out.println(")");
            }

            System.out.println("[필드 정보]");
            Field[] fields = clazz.getDeclaredFields();
            for(Field field : fields){
                System.out.print(field.getType().getName() + " " + field.getName());
                System.out.println();
            }

            System.out.println("[메서드 정보]");
            Method[] methods = clazz.getDeclaredMethods();
            for(Method method : methods){
                System.out.print(method.getName() + "(");
                printParameters(method.getParameterTypes());
                System.out.println(")");
            }

        } catch (Exception e){
            System.err.println(e.getMessage());
        }


    }

    public static void printParameters(Class[] parameters){
        for(int i = 0; i < parameters.length; i++){
            System.out.print(parameters[i].getName());
            if(i< parameters.length-1){
                System.out.print(", ");
            }
        }
    }
}
