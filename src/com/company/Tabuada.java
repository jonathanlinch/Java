package com.company;

import java.util.Scanner;

/* Desenvolva um gerador de tabuada, capaz de gerar a
   tabuada de qualquer número inteiro entre 1 a 10.
   O usuário deve informar de qual numero ele deseja ver a tabuada.
   A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50*/
public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Digite o número da tabuada: ");
        number = input.nextInt();

        for (int i = 1; i <= 10; i++){
            int result;
            result = number * i;
            System.out.printf("%s x %s = %s%n",number, i, result);
        }
    }
}
