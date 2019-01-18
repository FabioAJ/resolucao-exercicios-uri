/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 18/01/2019
Objetivo sucinto do programa: calcula kilometros por litro
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1014
*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		double kilometros = Double.parseDouble(entradaDados.next());
		double litros = Double.parseDouble(entradaDados.next());
		
		DecimalFormat formatador = new DecimalFormat("###0.000");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);

		double kilometrosPorLitro = kilometros / litros;

		System.out.println(formatador.format(kilometrosPorLitro) + " km/l");
	}
}
