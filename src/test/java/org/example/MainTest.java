package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void canCalculatePowerOfNumber() throws Exception {
        var num1=2;
        var num2=2;
        var expected =4;
        var actual= Main.calculate(num1,'+',num2);
        assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    void canAddTwoNumbers() throws Exception {
         var num1=3;
         var num2=2;
         var expected = 5;
         var actual= Main.calculate(num1,'+',num2);
         assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    void canSubtractTwoNumbers() throws Exception {
        var num1=3;
        var num2=2;
        var expected = 1;
        var actual= Main.calculate(num1,'-',num2);
        assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    void canMultiplyTwoNumbers() throws Exception {
        var num1=3;
        var num2=2;
        var expected = 6;
        var actual= Main.calculate(num1,'*',num2);
        assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    void canDivideTwoNumbers() throws Exception {
        var num1=4;
        var num2=2;
        var expected = 2;
        var actual= Main.calculate(num1,'/',num2);
        assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    void divideByZeroThrowsException() throws Exception {
        var num1=3;
        var num2=0;

        var exception=assertThrows(Exception.class,
                ()-> Main.calculate(num1,'/',num2));
        assertEquals("Cannot divide by zero",exception.getMessage());
    }
    @org.junit.jupiter.api.Test
    void invalidOperatorThrowsException() throws Exception {
        var num1=3;
        var num2=2;
        var operator ='=';

        var exception= assertThrows(Exception.class,
                ()->Main.calculate(num1,operator,num2)) ;

        assertEquals("Undefined Operator",exception.getMessage());

    }
}