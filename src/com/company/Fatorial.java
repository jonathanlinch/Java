package com.company;

import java.util.Scanner;

/* Faça um programa que calcule o fatorial
 de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120*/
public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número do fatorial: ");
        int number = input.nextInt();
        System.out.println(number +"!");
        int mult = 1;
        for (int i = number; i >= 1; i--) {
            mult = mult * i;
        }
        System.out.println(mult);


    }
}
