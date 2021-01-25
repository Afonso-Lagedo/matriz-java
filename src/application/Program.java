package application;

import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		// entrar com a ordem da matriz e mostrar a diagonal principal e a quantidade de números negativos
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter matriz order:");
		int n = sc.nextInt();
		int [][] mat = new int[n][n];//declarando a matriz de ordem n
		
		for (int i=0; i<mat.length; i++) {//usando o tamanho da linha
			for (int j=0; j<mat[i].length; j++) {//usando o tamanho do vetor correspondente aquela linha  
				System.out.printf("Element position %d x %d:", i, j);
				mat[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for (int i=0; i<n;i++) {
			System.out.print(mat[i][i]+ "; ");
		}
		
		System.out.println();
		
		int count = 0;
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if(mat[i][j]<0) {
					count++;
				}
			}
		}
		System.out.println("Negatives numbers:"+count);
		
						
		
		sc.close();
	}

}
