package EffectiveJava.java_base.Generic;

public class Box<T> {
    T t;

    Box(T t){
        this.t = t;
    }

    public T get(){
        return this.t;
    }

    public void set(T t){
        this.t = t;
    }


}
