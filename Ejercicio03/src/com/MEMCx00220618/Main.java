package com.MEMCx00220618;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite la cantidad de números: ");
        Scanner s = new Scanner(System.in);
        int num1 = Integer.parseInt(s.nextLine());
        int num2 = num1;
        System.out.println("Aquí se muestra el listado: ");
        RES(num1, num2, false);
    }

    public static void separador(int val, int condition) {
        if (val < condition - 1) {
            System.out.print("->");
            separador(val + 1, condition);
        }
    }

    public static void RES(int num1, int num2, boolean reverse) {
        int val = (num2 + 1 - num1);
        if (num1 > 1 && !reverse) {
            separador(0, val);
            System.out.println(val);
            RES(num1 - 1, num2, reverse);
        } else if (num1 <= num2) {
            reverse = true;
            separador(0, val);
            System.out.println(val);
            RES(num1 + 1, num2, reverse);
        }
    }

}