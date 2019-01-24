/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 24/01/2019
Objetivo sucinto do programa: Calcula o numero de cedulas
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1018
*/

import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		
		int dinheiro = entradaDados.nextInt();
		
		System.out.println(dinheiro);
		
		System.out.println(dinheiro / 100 + " nota(s) de R$ 100,00");
		dinheiro = dinheiro % 100;
		
		System.out.println(dinheiro / 50 + " nota(s) de R$ 50,00");
		dinheiro = dinheiro % 50;
		
		System.out.println(dinheiro / 20 + " nota(s) de R$ 20,00");
		dinheiro = dinheiro % 20;
		
		System.out.println(dinheiro / 10 + " nota(s) de R$ 10,00");
		dinheiro = dinheiro % 10;
		
		System.out.println(dinheiro / 5 + " nota(s) de R$ 5,00");
		dinheiro = dinheiro % 5;
		
		System.out.println(dinheiro / 2 + " nota(s) de R$ 2,00");
		dinheiro = dinheiro % 2;
		
		System.out.println(dinheiro / 1 + " nota(s) de R$ 1,00");
		dinheiro = dinheiro % 1;
		
	}
	
}