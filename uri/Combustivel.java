/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 23/01/2019
Objetivo sucinto do programa: Calcula o gasto de combustivel
Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1017
*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		
		double horas = entradaDados.nextInt();
		double velocidade = entradaDados.nextInt();
		double gastoDeCombustivel = ((horas * velocidade) / 12);
		
		DecimalFormat formatador = new DecimalFormat("#0.000");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);
		
		System.out.println(formatador.format(gastoDeCombustivel));
	}

}
