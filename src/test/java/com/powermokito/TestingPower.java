package com.powermokito;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermokito.PowerTesting;

import static org.mockito.Mockito.when;

@PrepareForTest( { PowerTesting.class })
public class TestingPower {

    @Test
    public void mockStaticMethodTest() {
        //Mock static methods
        PowerMockito.mockStatic(PowerTesting.class);

        //Set expectation
        when(PowerTesting.staticMessage()).thenReturn("New Message from Mock!");

        //invoke the method
        String message = PowerTesting.staticMessage();

        //Assert the stub response
        Assert.assertEquals(message, "New Message from Mock!");
    }

}




