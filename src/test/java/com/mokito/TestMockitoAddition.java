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

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
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
    when we dont tell mocks what to return they return NULL
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
    @Test
    public void letsMockListGetWithAny() {
        List<String> list = mock(List.class);
        when(list.get(anyInt())).thenReturn("test case success");

//        argument matcher
//        The anyInt method doesnt do any type checks, it is only there to avoid cascading in our code
        // If you are using argument matchers, all arguments
        // have to be provided by matchers.
        assertEquals("test case success", list.get(0));
        assertEquals("test case success", list.get(1));
    }

    @Test
    public void letsMockListThrowexception() {
        List<String> list = mock(List.class);
//        Mockitio with exception handling
        when(list.get(anyInt())).thenThrow(new RuntimeException("Something went wrong"));
        assertThrows(RuntimeException.class, () -> {
            list.get(0);
            list.get(1);
        });
    }


}
