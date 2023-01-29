package com.mokito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mokito.Addition;
import org.mokito.AdditionService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class TestMockitoAddition {
/*
    What is mocking?
    mocking is creating objects that simulate the behavior of real objects
    Unlike stubs, mocks can be dynamically created from code at runtime
    Mocks offer more functionality than stubs
    we can verify method calls and a lot more other things
    Mock creates mock object for a class or an interface
*/
    @Mock
    private AdditionService service;
    @InjectMocks
    private Addition obj;

    @BeforeEach
    public void init() {
        System.out.println("In before");
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddition(){
//        AdditionService service = mock(AdditionService.class);
//        Addition obj = new Addition(service);

        when(service.add(100,200)).thenReturn(300);
        assertEquals(300,obj.addition(100,200));
    }
}
