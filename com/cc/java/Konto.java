package com.cc.java;

public class Konto {

    // eine "int" Variable "kontostand" mit dem Wert 10000 angelegt \\
    private int kontostand = 10000;

    
    // Methode den Kontostand zu verdoppeln \\
    public void verdoppeln() {
        kontostand *= 2;
    }

    // Methode den Kontostand zu verdreifachen \\
    public void verdreifachen() {
        kontostand *= 3;
    }

    // Methode den Kontostand zu verzehnfachen \\
    public void verzehnfachen() {
        kontostand *= 10;
    }




public int getKontostand() {
    return kontostand;
}


}
