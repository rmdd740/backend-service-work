package com.example.backendservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class Test1 {

    @Test
    public void sum()
    {
        int a =5;
        int b=10;
        int c= a+b;
        Assertions.assertEquals(c,15);
    }
}
