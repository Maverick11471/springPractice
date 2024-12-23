package EffectiveJava.java_base.sec05;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Controller;

@Data
@Getter
@AllArgsConstructor
@Entity
public class ClassObjectMember {

    int num;
    String obj;

    ClassObjectMember(){

    }


    public static void method(int num, String obj){
        System.out.println("매개변수1: " + num);
        System.out.println("매개변수2: " + obj);
    }
}
