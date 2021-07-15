package com.cs5098sbext.test.correctness;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class StaticFieldWithValue {

    @Value("Wrong practice")
    public static String name;

}
