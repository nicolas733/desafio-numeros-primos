package br.com;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Numero.isPrime(n));
    }
}
