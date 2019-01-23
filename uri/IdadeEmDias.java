/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 23/01/2019
Objetivo sucinto do programa: Calcula a idade em dias
Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1020
*/

import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		
		int idade = entradaDados.nextInt();
		
		int diasAno = 365;
		int diasMes = 30;
		
		int ano = (idade / diasAno);
		int mes = (idade % diasAno) / diasMes;
		int dia = (idade % diasAno) % diasMes;
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
	}
	
}