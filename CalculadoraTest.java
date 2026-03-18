package edu.JavierBarrosoDiaz.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

          calculadora calc = new calculadora();

    @Test
    void testSumar() { assertEquals(5, calc.sumar(2,3)); }

    @Test
    void testDividir() { assertEquals(2, calc.dividir(4,2)); }

    @Test
    void testDividirPorCero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(4,0));
    }
}