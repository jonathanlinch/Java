package com.company;

/*Faça um programa que leia 5 números,
  informe o maior número e a média desses números*/

import java.util.Arrays;
import java.util.Scanner;

public class Maior_e_Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];
        int maior = 0;
        int soma = 0;
        System.out.println("Digite 5 números: ");
        for (int i = 0; i < 5; i++) {
            numeros[i] = input.nextInt();
            soma += numeros[i];
        }
        System.out.println(Arrays.toString(numeros));
        for (int i = 0; i < 5; i++){
            if(numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        int media = soma/5;
        System.out.println("Maior número: " + maior);
        System.out.println("Média dos números: " + media);
    }
}
