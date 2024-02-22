package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    void shouldCheckInstanceFfFizzBuzzClass() {
        //Arrange &Act
        FizzBuzz fizzbuzz = new FizzBuzz();
        //Assert
        assertEquals(true, fizzbuzz instanceof FizzBuzz);


    }

    @Test
    void shouldReturnTrueOnValidInput() {

        boolean result = fizzbuzz.validateInput(3);
        assertTrue(result);
    }

    @Test
    void shouldThrowExceptionOnInvalidInput() {

        Exception exception = assertThrows(Exception.class, () -> {
            fizzbuzz.getResult(-3);
        });

        assertEquals("Invalid Input", exception.getMessage());
    }


    @Test
    void shouldReturnFizzOnDivisibleByThree() throws Exception {
        String[] inputArray = {"1", "2", "fizz", "4"};
        ArrayList<String> expected = new ArrayList(Arrays.asList(inputArray));
        assertEquals(expected, fizzbuzz.getResult(4));
    }

    @Test
    void shouldReturnFizzOnDivisibleByThreeAndDivisibleByFive() throws Exception {
        String[] inputArray = {"1", "2", "fizz", "4", "buzz", "fizz", "7"};
        ArrayList<String> expected = new ArrayList(Arrays.asList(inputArray));
        assertEquals(expected, fizzbuzz.getResult(7));
    }

    @Test
    void shouldReturnFizzBuzzOnDivisibleByBoth() throws Exception {
        String[] inputArray = {"1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizzbuzz"};
        ArrayList<String> expected = new ArrayList(Arrays.asList(inputArray));
        assertEquals(expected, fizzbuzz.getResult(15));
    }

    @Test
    void shouldReturnErrorIfNumberIsGreaterThanThousand() throws  Exception{

        Exception exception=assertThrows(Exception.class,()->{
            fizzbuzz.getResult(1100);
        });
        assertEquals("Invalid Input",exception.getMessage());
    }

}