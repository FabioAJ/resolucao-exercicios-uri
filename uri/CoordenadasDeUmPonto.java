/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 25/01/2019
Objetivo sucinto do programa: Calcula a cordenada em um plano cartesiano
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1041
*/

import java.util.Scanner;

public class CoordenadasDeUmPonto {

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		
		double x = Double.parseDouble(entradaDados.next());
		double y = Double.parseDouble(entradaDados.next());
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x == 0 && y != 0) {
			System.out.println("Eixo Y");
		} else if (x != 0 && y == 0) {
			System.out.println("Eixo X");
		} else if (x >= 0 && y >= 0) {
			System.out.println("Q1");
		} else if (x <= 0 && y >= 0) {
			System.out.println("Q2");
		} else if (x <= 0 && y <= 0) {
			System.out.println("Q3");
		} else if (x >= 0 && y <= 0){
			System.out.println("Q4");
		}
	}
}
