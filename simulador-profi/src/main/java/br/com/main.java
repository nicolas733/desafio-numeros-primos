package br.com;

import java.util.Scanner;

import static br.com.Numero.isPrime;

public class main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número (ou 0 para sair): ");
            int numero = sc.nextInt();


            if (numero == 0) { 
                System.out.println("Encerrando o programa...");
                break;
            }
            if (isPrime(numero)) {
                System.out.println(numero + " é primo!");
            } else {
                System.out.println(numero + " não é primo!");
            }
        }
    }
}
