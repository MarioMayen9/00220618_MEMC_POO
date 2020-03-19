package com.MEMCx00220618;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String palabra = "";
        System.out.println("Ingrese sus letras; ");
        palabra = s.nextLine();
        String vocalesMinusculasMayusculas = "aeiouAEIOU";

        System.out.println(palabra);
        ArrayList<String> misVocales = new ArrayList<String>();
        String letra;

        // Barrer la frase ingresada por el usuario
        for (int i = 0; i <= palabra.length() -1; i++) {
            letra = palabra.substring(i, i+1);
            // Si la encuentra, agregarla a la lista de vocales
            if (vocalesMinusculasMayusculas.contains(letra)) {
                misVocales.add(letra);
            }
        }

        // Imprimir el resultado
        for (int i = 0; i <= misVocales.size() -1; i++) {
             System.out.println(misVocales.get(i));
        }
    }
}

