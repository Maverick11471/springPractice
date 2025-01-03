package EffectiveJava.reflection;

import java.lang.reflect.Constructor;

public class CarReflectionExample {
    public static void main(String[] args) throws Exception {

        Class clazz = Car.class;

        Constructor[] constructors = clazz.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            String a = constructor.getName();
            System.out.print(a + "(");
            Class[] parameters = constructor.getParameterTypes();
            parameters(parameters);
        }
    }

    public static void parameters(Class[] parameters){
        for(int i = 0; i<parameters.length ; i++){
            String b = parameters[i].getName();
            System.out.print(b);
            if(i<parameters.length -1){
                System.out.print(", ");
            }
        }
    }

}
