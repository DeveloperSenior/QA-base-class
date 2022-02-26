// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class LeapTest {

    @Test
    void shouldLeapYearDivisibleFour() {
        int year = 1996;
        boolean actual = Leap.isLeapYear(year,4);
        assertTrue(actual);
    }
    
    @Test
    void shouldLeapYearDivisibleOneHundred() {
        int year = 2001;
        boolean actual = Leap.isLeapYear(year,100);
        assertFalse(actual);
    }
    
    @Test
    void shouldLeapYearDivisibleFourHundred() {
        int year = 2000;
        boolean actual = Leap.isLeapYear(year,400);
        assertTrue( actual);
    }
}
