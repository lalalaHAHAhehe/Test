package com.meter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class CoreTest {

    @Test
    public void testTrue() {
        Assert.isTrue(true, "啦啦啦");
    }

    @Test
    public void testFail() {
        Assert.isTrue(true, "错咯");
    }

}
