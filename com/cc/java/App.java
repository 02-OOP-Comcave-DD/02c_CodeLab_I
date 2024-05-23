package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
    // Erzeugen von 3 Konto-Instanzen \\
    Konto konto1 = new Konto();
    Konto konto2 = new Konto();
    Konto konto3 = new Konto();

    // Ausgabe der einzelnen Konten \\
    System.out.println("Kontostand für Konto 1: " + konto1.getKontostand());
    System.out.println("Kontostand für Konto 2: " + konto2.getKontostand());
    System.out.println("Kontostand für Konto 3: " + konto3.getKontostand());








    } 

}