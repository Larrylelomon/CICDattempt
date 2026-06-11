package com.java;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class MainTest {

    @Test
    void PrintingHello(){
        Main t = new Main();
        assertEquals(9, t.add(4, 5));
    }
    
}
