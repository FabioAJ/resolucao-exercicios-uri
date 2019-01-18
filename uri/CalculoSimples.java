/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 18/01/2019
Objetivo sucinto do programa: Faz um calculo simples
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1010
*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class CalculoSimples {

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		
		int codigo1 = Integer.parseInt(entradaDados.next());
		int pecas1 = Integer.parseInt(entradaDados.next());
		double valorUnitario1 = Double.parseDouble(entradaDados.next());
		
		int codigo2 = Integer.parseInt(entradaDados.next());
		int pecas2 = Integer.parseInt(entradaDados.next());
		double valorUnitario2 = Double.parseDouble(entradaDados.next());
		
		DecimalFormat formatador = new DecimalFormat("#0.00");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);
	
		double valorTotal = (pecas1 * valorUnitario1) + (pecas2 * valorUnitario2);
		
		System.out.println("VALOR A PAGAR: R$ " + formatador.format(valorTotal));
		entradaDados.close();
	}

}
