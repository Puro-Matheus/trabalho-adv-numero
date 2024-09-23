package TrabalhoAdvNumero;

import java.util.Random;
import java.util.Scanner;

public class adivinheoNumero {
     public static void main(String[] args) {
    Random numeroAleatorio = new Random();
    int numeroGerado = numeroAleatorio.nextInt(101);
    int tentativas = 0;
    Scanner lerTeclado = new Scanner(System.in);
    do {
        System.out.println("Digite seu palpite: ");
        int palpite = lerTeclado.nextInt();
        if (palpite == numeroGerado) {
            System.out.println("Você acertou!");
            break;
        }
        else if (palpite < numeroGerado) {
            System.out.println("A resposta é maior que o número digitado.");
        }
        else if (palpite > numeroGerado) {
            System.out.println("A resposta é menor que o número digitado.");
        }
        tentativas = tentativas + 1;
    } while (tentativas < 15);
    if (tentativas == 15) {
        System.out.println("Você perdeu!");
        System.out.println("A resposta correta era " + numeroGerado);
    } 
    else {
        System.out.println("Restaram " + (14 - tentativas) + " tentativas");
    }
    lerTeclado.close();
}
}