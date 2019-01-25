/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 25/01/2019
Objetivo sucinto do programa: Calcula um intervalo entre numeros
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1038
*/

import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		
		double numero = Double.parseDouble(entradaDados.next());
		
		if (numero >= 0 && numero <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (numero >= 25 && numero <= 50) {
			System.out.println("Intervalo (25,50]");
		} else if (numero >= 50 && numero <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if (numero >= 75 && numero <= 100) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
	}
}
