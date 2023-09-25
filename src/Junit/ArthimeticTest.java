package Junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArthimeticTest {

    Arthimetic a=new Arthimetic();

    @Test
    public void sum() {
        assertEquals("error",10,a.sum(6,5));
    }
}