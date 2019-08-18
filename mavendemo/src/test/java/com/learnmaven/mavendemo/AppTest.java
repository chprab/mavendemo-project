package com.learnmaven.mavendemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.learnmaven.mavendemo.calculator.CalculatorService;
import com.learnmaven.mavendemo.calculator.Icalculator;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	Icalculator icalculator = new CalculatorService();
	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testAdd() {
    	
    	assertEquals(7, icalculator.add(5, 2));
    }
    
    @Test
    public void testSubtract() {
    	
    	assertEquals(3, icalculator.subtract(5, 2));
    }
    
    @Test
    public void testMultiply() {
    	
    	assertEquals(10, icalculator.multiply(5, 2));
    }
    
    @Test
    public void testDivide() {
    	
    	assertEquals(3, icalculator.divide(6, 2));
    }
}
