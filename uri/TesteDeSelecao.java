/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 24/01/2019
Objetivo sucinto do programa: Cria um teste de seleção
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1035
*/

import java.util.Scanner;

public class TesteDeSelecao {

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		int a = entradaDados.nextInt();
		int b = entradaDados.nextInt();
		int c = entradaDados.nextInt();
		int d = entradaDados.nextInt();

		if ((b > c) && (d > a) && (c + d) > (a + b) && (c + d) > 0 && (a % 2) == 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
	}
}