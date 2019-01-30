/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 29/01/2019
Objetivo sucinto do programa: calcula a soma de impares consecutivos
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1158
*/

import java.util.Scanner;

public class SomaDeImpares {

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);

		int operacoes = entradaDados.nextInt();

		for (int i = 0; i < operacoes; i++) {
			int x = entradaDados.nextInt();
			int y = entradaDados.nextInt();

			int resultado = 0;
			int vezes = 0;

			while (true) {
				if (x % 2 != 0) {
					resultado += x;
					vezes++;
				}
				if (vezes == y) {
					break;
				}
				x++;
			}
			
			System.out.println(resultado);
		}
	}
}
