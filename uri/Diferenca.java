/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 16/01/2019
Objetivo sucinto do programa: Calcula uma diferença de inteiros
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1007
*/

import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		
		int a = entradaDados.nextInt();;
		int b = entradaDados.nextInt();;
		int c = entradaDados.nextInt();;
		int d = entradaDados.nextInt();;
		
		System.out.println("DIFERENCA = " + (a * b - c * d));
		entradaDados.close();
	}

}
