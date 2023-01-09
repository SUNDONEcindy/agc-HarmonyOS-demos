package com.huawei.apms.hos.crash;

import ohos.aafwk.ability.delegation.AbilityDelegatorRegistry;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleOhosTest {
    @Test
    public void testBundleName() {
        final String actualBundleName = AbilityDelegatorRegistry.getArguments().getTestBundleName();
        assertEquals("com.huawei.apms.hos.crash", actualBundleName);
    }
}