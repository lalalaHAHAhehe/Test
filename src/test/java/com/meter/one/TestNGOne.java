package com.meter.one;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class TestNGOne {

    @Test
    public void success(){
        System.out.println("JunitTest fail");
        Assertions.assertTrue(true, "123");
    }

    @Test
    public void fail(){
        System.out.println("JunitTest fail");
        Assertions.assertTrue(false, "123");
    }

}
