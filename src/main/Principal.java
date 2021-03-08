package main;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, y, numero;
		int[][] matriz;
		char[][] matrizTmp;
		
		System.out.println("Informe o tamanho da matriz:");
		System.out.print("X: ");
		x = scan.nextInt();
		System.out.print("Y: ");
		y = scan.nextInt();
		
		matriz = new int[x][y];
		matrizTmp = new char[x][y];
		
		for(int i=0; i<x; i++) 
			for(int j=0; j<y; j++) 
				matriz[i][j] = scan.nextInt();
		
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) 
				System.out.print(matriz[i][j]);
			System.out.println();
		}
			
		System.out.println("Informe um número a ser localizado na matriz:");
		numero = scan.nextInt();
		System.out.printf("%n------------ Painel ------------ %n%n");
		for(int i=0; i<x; i++) 
			for(int j=0; j<y; j++) {
				if(numero == matriz[i][j] ) {
					System.out.println("--- o Número " + numero + " foi localizado nas coordenadas x:" + (i + 1) + " e y:" + (j + 1));
					matrizTmp[i][j] = 'X';
					if(j > 0) 
						System.out.print(":Esquerda[" + matriz[i][j - 1] +"]  ");
					if(j < x - 1) 
						System.out.print(":Direita[" + matriz[i][j + 1] +"]  " );
					if(i > 0) 
						System.out.print(":Cima[" + matriz[i - 1][j] +"]  ");
					if(i < y - 1) 
						System.out.print(":Baixo[" + matriz[i + 1][j] +"]  ");
					System.out.printf("%n %n");
				} else 
					matrizTmp[i][j] = 'O';
			}
		
		for(int i=0; i<x; i++) {
			for(int j=0; j<y; j++) 
				System.out.printf(matrizTmp[i][j] + " ");
			System.out.println();
		}
	}
}
