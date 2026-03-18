package edu.JavierBarrosoDiaz.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorTemperaturaTest {

    ConversorTemperatura conv = new ConversorTemperatura();

    @Test
    void testCelsiusAFahrenheit() { assertEquals(32, conv.celsiusAFahrenheit(0)); }

    @Test
    void testFahrenheitACelsius() { assertEquals(0, conv.fahrenheitACelsius(32)); }
}