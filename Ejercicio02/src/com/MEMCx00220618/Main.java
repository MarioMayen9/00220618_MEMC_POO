package com.MEMCx00220618;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String x, y = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Digite su palabra:");
        x = s.nextLine();
        int n = x.length();
        for(int i = n - 1; i >= 0; i--)
        {
            y = y + x.charAt(i);
        }
        if(x.equalsIgnoreCase(y))
        {
            System.out.println("La palabra es palindrome.");
        }
        else
        {
            System.out.println("La palabra no es palindrome.");
        }
    }
    }

