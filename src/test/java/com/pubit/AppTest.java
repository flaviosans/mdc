package com.pubit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {        
        assertEquals(3, App.mdc("9 12"));
        assertEquals(7, App.mdc("35 49"));
    }
}
