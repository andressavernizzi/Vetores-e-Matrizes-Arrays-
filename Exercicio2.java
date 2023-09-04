package exercicios4;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetor [] = new int[10];
		int soma = 0;
		float media = 0;
		int contador = 0;

		for(int i = 0; i<10;i++) {
			System.out.println("Digite o "+(i+1)+"ºNumero: ");
			vetor[i] = leia.nextInt(); 
		}
		System.out.println("Elementos nos indices impares: ");
		for(int i = 0; i<10; i++) {
			if(vetor[i]%2 != 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		System.out.println("\nElementos nos indices pares: ");
		for(int i = 0; i<10; i++) {
			if(vetor[i]%2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		System.out.println("\nSoma dos elementos: ");
		for(int i = 0; i<10; i++) {
			contador +=1;
			soma += vetor[i];
			media = soma/contador;
		}
		System.out.print(soma);
		System.out.println("\nMedia dos elementos: ");
		System.out.print(media);
	}
}
