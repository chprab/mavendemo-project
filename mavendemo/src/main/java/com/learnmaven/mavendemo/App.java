package com.learnmaven.mavendemo;


import com.learnmaven.mavendemo.calculator.CalculatorService;
import com.learnmaven.mavendemo.calculator.Icalculator;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args )
    {
    	Icalculator icalculator = new CalculatorService();
    	System.out.println(icalculator.add(2, 5));
    	System.out.println(icalculator.subtract(5, 2));
    	System.out.println(icalculator.multiply(2, 5));
    	System.out.println(icalculator.divide(6, 2));
        
    }
    
    
    
}
