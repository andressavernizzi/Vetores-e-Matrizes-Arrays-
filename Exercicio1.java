package exercicios4;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = {2,5,1,3,4,9,7,8,10,6};
		int numero;
		boolean encontrado = false;
		
		System.out.println("Digite o numero que deseja encontrar: ");
		numero = leia.nextInt();
		
		for(int i = 0; i<10;i++) {
			if(numero == vetor[i]) {
				System.out.println("O numero "+numero+" está localizado na posição: "+i);
				encontrado = true;
                break;
			}
		}
		if (!encontrado) {
            System.out.println("O número "+numero+" não foi encontrado");
        }
	}
}
