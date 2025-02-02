package tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /*
    @Test
    @DisplayName("Making a test for a calculator where we adding")
    void testAdd() {
        var cal = new Calculator();

        int a = 7;
        int b = 3;

        int expected = 10;
        int actual = cal.add(a, b);

        assertEquals(expected, actual);
    }
     */

    @Test
    @DisplayName("Making a test for a calculator where we subtraction")
    void testSub() {
        var cal = new Calculator();

        int a = 15;
        int b = 5;

        int expected = 10;
        int actual = cal.subtract(a, b);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Making a test for a calculator where we multiplying")
    void testMultiply() {
        var cal = new Calculator();

        int a = 20;
        int b = 5;

        int expected = 100;
        int actual = cal.multiply(a, b);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Making a test for a calculator where we dividing")
    void testDivide() {
        var cal = new Calculator();

        int a = 50;
        int b = 10;

        int expected = 5;
        int actual = cal.divide(a, b);

        assertEquals(expected, actual);
    }
/*
    @Test
    @DisplayName("Add method to take a String")
    void testAddString(){
        var cal = new Calculator();

        String numbers = "1,2,3";

        int expected = 6;
        int actual = cal.add(numbers);

        assertEquals(expected, actual);
    }
 */


    @Test
    @DisplayName("Testing add with Int Array")
    void testAddWithIntArray() {
        Calculator cal = new Calculator();

        int[] numbers = {1, 2, 3};

        int expected = 6;
        int actual = cal.add(numbers);

        assertEquals(expected, actual);
    }

}