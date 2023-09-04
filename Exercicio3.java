package exercicios4;

public class Exercicio3 {
	public static void main(String[] args) {
		
		int matriz [] [] = {{1,2,3},{4,5,6},{7,8,9}};
		int somaP = 0;
		int somaS = 0;
		
		System.out.println("Elementos da Diagonal Principal: ");
		for(int i = 0; i <3;i ++) {
			for(int k = 0;k<3;k ++) {
				if(i == 0 && k == 0||i == 1 && k == 1||i == 2 && k == 2) {
					System.out.println(matriz[i][k]);
					somaP += matriz[i][k];
				}
			}
		}
		System.out.println("Elementos da Diagonal Secundaria: ");
		for(int i = 0; i <3;i ++) {
			for(int k = 0;k<3;k ++) {
				if(i == 0 && k == 2||i == 1 && k == 1||i == 2 && k == 0) {
					System.out.println(matriz[i][k]);
					somaS += matriz[i][k];
				}
			}
		}
		System.out.println("Soma dos elementos da diagonal principal: "+somaP);
		System.out.println("Soma dos elementos da diagonal principal: "+somaS);
	}

}
