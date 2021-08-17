package com.meter;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class TestNG {

    @Test
    public void success(){
        System.out.println("JunitTest fail");
        A.a();
        Assertions.assertTrue(true, "123");
    }

    @Test
    public void fail(){
        System.out.println("JunitTest fail");
        A.a();
        Assertions.assertTrue(false, "123");
    }

}
