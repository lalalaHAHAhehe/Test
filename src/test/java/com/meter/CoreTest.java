package com.meter;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

//@SpringBootTest
public class CoreTest {

    @Test
    public void testTrue() {
        A.a();
        Assert.isTrue(true, "啦啦啦");
    }

    @Test
    public void testFail() {
        A.a();
        Assert.isTrue(false, "错咯");
    }

    @Test
    public void testFail2() {
        A.a();
        Assert.isTrue(false, "错咯222");
    }

}
