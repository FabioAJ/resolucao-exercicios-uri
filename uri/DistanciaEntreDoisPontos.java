/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 22/01/2019
Objetivo sucinto do programa: Calcula a distancia entre 2 pontos
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1015
*/

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class DistanciaEntreDoisPontos {

	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		
		float a = Float.parseFloat(entradaDados.next());
		float b = Float.parseFloat(entradaDados.next());
		float c = Float.parseFloat(entradaDados.next());
		float d = Float.parseFloat(entradaDados.next());
		
		double distancia = (Math.sqrt((Math.pow(c - a, 2)) + (Math.pow(d - b, 2))));
		DecimalFormat formatador = new DecimalFormat("#0.0000");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);
		
		System.out.println(formatador.format(distancia));
	}

}
