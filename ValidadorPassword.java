package edu.JavierBarrosoDiaz.endes;

public class ValidadorPassword {

    public boolean esValida(String password) {
        if (password == null) return false;
        return password.matches("^(?=.*[A-Z])(?=.*\\d).{8,}$");
    }
}