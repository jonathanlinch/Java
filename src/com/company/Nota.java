package com.company;

import java.util.Scanner;

/*Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e
continue pedindo até que o usuário informe um valor válido.*/
public class Nota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        System.out.println("Insira uma nota entre 0 e 10: ");
        nota = entrada.nextInt();
        boolean verifica = nota <= 10 && nota >= 0;
        while (!verifica){
            System.out.println("Insira um valor válido!");
            nota = entrada.nextInt();
           verifica = nota <= 10 && nota >= 0;
        }
    }
}
