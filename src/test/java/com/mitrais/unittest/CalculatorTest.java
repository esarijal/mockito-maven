package com.mitrais.unittest;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTest {

    private ICalculatorInterface mockCalculator = mock(ICalculatorInterface.class);
    private final Calculator calculator = new Calculator(mockCalculator);

    @Test
    public void add_TenAddEight_ReturnsEighteen(){
        // setup
        when(mockCalculator.add(10, 8)).thenReturn(18);
        final int expected = 18;


        final int actual = calculator.add(10, 8);
        assertThat(actual, is(equalTo(expected)));
    }
}
