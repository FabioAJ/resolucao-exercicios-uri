/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 17/01/2019
Objetivo sucinto do programa: Calcula um salario com comissao
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1009
*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class SalarioComBonus {

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		
		String nome = entradaDados.nextLine();
		double salario = Double.parseDouble(entradaDados.next());
		double vendas = Double.parseDouble(entradaDados.next());
		
		DecimalFormat formatador = new DecimalFormat("#0.00");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);
	
		double comissao = (vendas * 0.15) + salario;
		
		System.out.println("TOTAL = R$ " + formatador.format(comissao));
		entradaDados.close();
	}
}
