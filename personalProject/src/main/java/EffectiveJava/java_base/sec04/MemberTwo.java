package EffectiveJava.java_base.sec04;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class MemberTwo {
    private final String id;
    @NonNull private String name;
    private int age;
}
