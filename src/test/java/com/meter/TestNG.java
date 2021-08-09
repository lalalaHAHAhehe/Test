package com.meter;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG {

    @Test
    public void ngSuccess() {
        A.a();
        Assert.assertTrue(true, "哈哈");
    }

    @Test
    public void ngFail1() {
        A.a();
        System.out.println("test Ng");
        throw new RuntimeException("23");
//        Assert.assertTrue(false,"boom");
    }

    @Test
    public void ngFail2() {
        A.a();
        System.out.println("test Ng");
        Assert.assertTrue(false, "boom");
    }

}
