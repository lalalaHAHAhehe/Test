package com.meter;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.util.Assert;

@RunWith(JUnit4.class)
public class JunitTest extends TestCase {

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
