/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 23/01/2019
Objetivo sucinto do programa: Calcula a distancia
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1016
*/

import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		
		int distancia = entradaDados.nextInt();
		int tempo = (distancia * 2);
		
		System.out.println(tempo + " minutos");
	}

}
