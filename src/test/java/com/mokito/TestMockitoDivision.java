package com.mokito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mokito.Division;
import org.mokito.DivisionService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class TestMockitoDivision {
//    Parameterized tests make it possible to run a test multiple times with different arguments.
//    They are declared just like regular @Test methods but use the @ParameterizedTest annotation instead.
//    In addition, you must declare at least one source that will provide the arguments for
//    each invocation and then consume the arguments in the test method.
    @Mock
    private DivisionService service;
    @InjectMocks
    Division obj;

//    JUnit 5 has the ability to repeat a test a specified number
//    of times simply by annotating a method with @RepeatedTest and
//    specifying the total number of repetitions desired.
//    Each invocation of a repeated test behaves like the execution of a regular @Test method.

//    The @BeforeEach annotation denotes that the annotated method should be executed before each test method
    @BeforeEach
    public void init() {
        System.out.println("In before");
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testDivision(){

        when(service.div(100,200)).thenReturn(300);
        assertEquals(300,obj.division(100,200));
    }
}
