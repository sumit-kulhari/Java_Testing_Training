import org.example.Addition;
import org.junit.jupiter.api.*;

import static junit.framework.Assert.assertEquals;

public class TestAddition {
    static Addition addition;
    @BeforeAll
    public static void define(){
        addition = new Addition();
    }
    @Test
    @DisplayName("My 1st Test Case")
    @Tag("Addition")
    public void testAddition(){
        System.out.println("In Test case");
        Assertions.assertEquals(30, addition.Add(10,20));
    }

    @Test
    @DisplayName("2nd Test case")
    @Tag("Addition")
    public void test2(){
        System.out.println("2nd test case");
        assertEquals(40,addition.Add(20,20));
    }

    @Test
    @DisplayName("Subtraction test case")
    public void subtr(){
        System.out.println("In subtraction test case");
        assertEquals(40,addition.subtraction(50,10));
    }

    @Test
    @DisplayName("Division test case")
    public void div(){
        System.out.println("In div test case");
        assertEquals(2,addition.div(100,2));
    }

    @Test
    @DisplayName("Multiplication test case")
    public void multi(){
        System.out.println("In multiplication test case");
        assertEquals(50,addition.multiplication(25,2));
    }
}
