package com.mitrais.unittest;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
//import static org.junit.Assert.assertEquals;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class AppTest
{
    @Test
    public void add_ThreePlusFour_ReturnsSeven()
    {
        // Arrange
        final int expected = 7;

        // act
        final int actual = StaticCalculator.add(3, 4);

        // assert
        assertThat(actual, is(equalTo(expected)));
//        assertEquals(actual, expected);
    }

    @Test
    public void add_ThreePlusFour_NotReturnEight(){
        final int expected = 8;
        final int actual = StaticCalculator.add(3, 4);
        assertThat(actual, not(expected));
    }

    @Test
    public void divide_TenDivideByTwo_ReturnsFive(){
        final double expected = 5.0;
        final double actual = StaticCalculator.divide(10, 2);
        assertThat(actual, is(equalTo(expected)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void divide_TenDivideByZeroThrowsIllegalArgException(){
        StaticCalculator.divide(10, 0);
    }
}
