package Livraria.Estructure;

import java.util.Random;
import java.util.Scanner;

public class testeJonatas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(6) + 1;

        while (true) {
            if (numero != numeroAleatorio) {
                System.out.println("Você errou! Tente novamente.");
                System.out.println("Digite um numero: ");
                numero = sc.nextInt();

                if (numero == numeroAleatorio) {
                    System.out.println("Parabéns! Você acertou o número aleatório: " + numeroAleatorio);
                }

            System.out.println("Deseja continuar? (S/N): ");
            String continuar = sc.next();
            if (continuar.equals("S") || continuar.equals("s")) {
                System.out.println("Digite um numero: ");
                numero = sc.nextInt();
            } else {
                System.out.println("Programa encerrado.");
                break;

                }
            }

        }

    }

    }


