package org.example;

public class Main {
    public static void main(String[] args)
    {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro = new Libro("Il Signore degli Anelli", 1954, "J.R.R. Tolkien");
        Rivista rivista = new Rivista("National Geographic", 2023, "Vol. 1");

        biblioteca.addMaterial(libro);
        biblioteca.addMaterial(rivista);

        biblioteca.viewMaterial();
    }
}