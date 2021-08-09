package com.meter;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

//@SpringBootTest
public class JunitTest {

    @Test
    public void junitTrue() {
        A.a();
        Assert.isTrue(true, "啦啦啦");
    }

    @Test
    public void junitFail1() {
        A.a();
        Assert.isTrue(false, "错咯");
    }

    @Test
    public void junitFail2() {
        A.a();
        Assert.isTrue(false, "错咯2");
    }

}
