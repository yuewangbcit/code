package code.unitTesting;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Demonstrates a simple technique for mocking random numbers.
 *
 * @author BCIT
 * @version 2020
 */
public class MockingExampleTest {

    @Mock
    private Random fakeRandom = mock(Random.class);

    /**
     * Tests the version of rollDie that uses dependency injection.
     */
    @Test
    public void rollDieNewMethodWithRandomReturnsCorrectSum() {

        // doReturn(0).when(fakeRandom).nextInt(6);
        when(fakeRandom.nextInt(6)).thenReturn(1).thenReturn(2).thenReturn(3);

        assertEquals(9, MockingExample.rollDie(fakeRandom, 3, 6));
    }

    /**
     * Tests the version of rollDie that does not use dependency injection.
     */
    @Test
    public void rollDieOldMethodWithRandomReturnsCorrectSum() {
        // Insert your code here!
    }

}