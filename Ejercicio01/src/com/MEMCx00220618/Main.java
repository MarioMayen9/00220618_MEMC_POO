package com.MEMCx00220618;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        int num1=1, num2=1, num3, numero;
        System.out.print("Ingrese la cantidad de numeros para calcular la serie de Fibonacci: ");
        numero= h.nextInt();
        System.out.print(num1+" "+num2+" ");
        for(int i=1; i<=numero-2;i++){
            num3 = num1+num2;
            num1=num2;
            num2=num3;
            System.out.print(num3+" ");
        }

    }
}