package cegepst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzConverterTest {

    private FizzBuzzConverter fizzBuzzConverter;

    public FizzBuzzConverterTest() {
        this.fizzBuzzConverter = new FizzBuzzConverter();
    }

    @Test
    public void fizzTest() {
        assertEquals("Fizz", fizzBuzzConverter.convert(3));
        assertEquals("Fizz", fizzBuzzConverter.convert(9));
        assertEquals("Fizz", fizzBuzzConverter.convert(21));
    }

    @Test
    public void buzzTest() {
        assertEquals("Buzz", fizzBuzzConverter.convert(5));
        assertEquals("Buzz", fizzBuzzConverter.convert(10));
        assertEquals("Buzz", fizzBuzzConverter.convert(20));
    }

    @Test
    public void fizzBuzzTest() {
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(15));
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(30));
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(45));
    }

    @Test
    public void normalTest() {
        assertEquals("1", fizzBuzzConverter.convert(1));
        assertEquals("4", fizzBuzzConverter.convert(4));
    }

}