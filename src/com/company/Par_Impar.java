package com.company;

import java.util.Arrays;
import java.util.Scanner;

/*  Faça um programa que peça N números inteiros.
    Calcule e mostre a quantidade de números pares
    e a quantidade de números impares.*/
public class Par_Impar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor;
        int pares = 0,impares = 0;
        int a;
        int i = 0;
        System.out.println("Quantos números quer testar?");
        a = input.nextInt();
        do {
            System.out.println("Digite o numero: ");
            valor = input.nextInt();
            if (valor % 2 == 0){
                pares++;
            }else {
                impares++;
            }
            i++;
        } while (i < a);
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números impares: " + impares);
    }
}
