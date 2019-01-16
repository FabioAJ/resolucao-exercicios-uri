/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 16/01/2019
Objetivo sucinto do programa: Calcula uma diferença de inteiros
Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1007
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
