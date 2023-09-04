package exercicios4;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float matriz [] [] = new float [10][4];
		float soma = 0;
		float media = 0;
		float vetor[] = new float[10];
		
		for(int i = 0; i <1;i ++) {
			for(int k = 0;k<4;k ++) {
				System.out.println("\nDigite a "+(i+1)+"ª nota de Maria: ");
				matriz[i][k] = leia.nextFloat();
				soma += matriz[i][k];
				media = soma/4;
				vetor[0] = media;
			}
		}
		System.out.printf("A média de Maria é: %.1f",media);
		soma = 0;
		media = 0;
		
		for(int i = 1; i <2;i ++) {
			for(int k = 0;k<4;k ++) {
				System.out.println("\nDigite a "+(i)+"ª nota de Carlos: ");
				matriz[i][k] = leia.nextFloat();
				soma += matriz[i][k];
				media = soma/4;
				vetor[1] = media;
			}
		}
		System.out.printf("A média de Carlos é: %.1f",media);
		soma = 0;
		media = 0;
		
		for(int i = 2; i <3;i ++) {
			for(int k = 0;k<4;k ++) {
				System.out.println("\nDigite a "+(i-1)+"ª nota de Suzana: ");
				matriz[i][k] = leia.nextFloat();
				soma += matriz[i][k];
				media = soma/4;
				vetor[2] = media;
			}
		}
		System.out.printf("A média de Suzana é: %.1f",media);
		soma = 0;
		media = 0;
		
		for(int i = 3; i <4;i ++) {
			for(int k = 0;k<4;k ++) {
				System.out.println("\nDigite a "+(i-2)+"ª nota de Pedro: ");
				matriz[i][k] = leia.nextFloat();
				soma += matriz[i][k];
				media = soma/4;
				vetor[3] = media;
			}
		}
		System.out.printf("A média de Pedro é: %.1f",media);
		soma = 0;
		media = 0;
		
		for(int i = 4; i <5;i ++) {
			for(int k = 0;k<4;k ++) {
				System.out.println("\nDigite a "+(i-3)+"ª nota de Carla: ");
				matriz[i][k] = leia.nextFloat();
				soma += matriz[i][k];
				media = soma/4;
				vetor[4] = media;
			}
		}
		System.out.printf("A média de Carla é: %.1f",media);
		soma = 0;
		media = 0;
		
		for(int i = 5; i <6;i ++) {
			for(int k = 0;k<4;k ++) {
				System.out.println("\nDigite a "+(i-4)+"ª nota de Rute: ");
				matriz[i][k] = leia.nextFloat();
				soma += matriz[i][k];
				media = soma/4;
				vetor[5] = media;
			}
		}
		System.out.printf("A média de Rute é: %.1f",media);
		soma = 0;
		media = 0;
		
		for(int i = 6; i <7;i ++) {
			for(int k = 0;k<4;k ++) {
				System.out.println("\nDigite a "+(i-5)+"ª nota de Patricia: ");
				matriz[i][k] = leia.nextFloat();
				soma += matriz[i][k];
				media = soma/4;
				vetor[6] = media;
			}
		}
		System.out.printf("A média de Patricia é: %.1f",media);
		soma = 0;
		media = 0;
		
		for(int i = 7; i <8;i ++) {
			for(int k = 0;k<4;k ++) {
				System.out.println("\nDigite a "+(i-6)+"ª nota de Joana: ");
				matriz[i][k] = leia.nextFloat();
				soma += matriz[i][k];
				media = soma/4;
				vetor[7] = media;
			}
		}
		System.out.printf("A média de Joana é: %.1f",media);
		soma = 0;
		media = 0;
		
		for(int i = 8; i <9;i ++) {
			for(int k = 0;k<4;k ++) {
				System.out.println("\nDigite a "+(i-7)+"ª nota de Thais: ");
				matriz[i][k] = leia.nextFloat();
				soma += matriz[i][k];
				media = soma/4;
				vetor[8] = media;
			}
		}
		System.out.printf("A média de Thais é: %.1f",media);
		soma = 0;
		media = 0;
		
		for(int i = 9; i <10;i ++) {
			for(int k = 0;k<4;k ++) {
				System.out.println("\nDigite a "+(i-8)+"ª nota de Raphael: ");
				matriz[i][k] = leia.nextFloat();
				soma += matriz[i][k];
				media = soma/4;
				vetor[9] = media;
			}
		}
		
		System.out.printf("A média de Raphael é: %.1f",media);
		System.out.println("O vetor final das médias é: ");
		for(float alune: vetor) {
			System.out.println(alune);
		}
	}
}
