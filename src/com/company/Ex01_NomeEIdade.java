package com.company;

import java.util.Scanner;
/* Um programa que peça nome e idade, repetidamente.
    Ao pressionar 0 ele encerra.*/
public class Ex01_NomeEIdade {
    public static void main(String[] args) {
        nome();
    }
    public static void nome(){
        Scanner inputNome = new Scanner(System.in);
        Scanner inputIdade = new Scanner(System.in);
        while(true) {
            System.out.println("Insira o nome: ");
            String nome = inputNome.nextLine();
            if (nome.equals("0")) break;

            System.out.println("Insira a idade: ");
            int idade = inputIdade.nextInt();
        }
    }
}
