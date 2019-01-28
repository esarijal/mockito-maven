package com.mitrais.unittest;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ICalculatorTest {
    @Test
    public void add_ThreePlusFour_ReturnsSeven()
    {
        // Arrange
        final int expected = 7;
        ICalculatorInterface calculator = mock(ICalculatorInterface.class);
        when(calculator.add(3, 4)).thenReturn(7);

        // act
        final int actual = calculator.add(3, 4);

        // assert
        assertThat(actual, is(equalTo(expected)));
    }
}
