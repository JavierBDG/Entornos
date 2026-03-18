package edu.JavierBarrosoDiaz.endes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorPasswordTest {

    ValidadorPassword val = new ValidadorPassword();

    @Test
    void testPasswordValida() { assertTrue(val.esValida("Abc12345")); }

    @Test
    void testPasswordInvalida() { assertFalse(val.esValida("abc")); }

    @Test
    void testPasswordNull() { assertFalse(val.esValida(null)); }
}