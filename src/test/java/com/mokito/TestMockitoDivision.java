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
    @Mock
    private DivisionService service;
    @InjectMocks
    Division obj;

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
