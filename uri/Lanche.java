/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 24/01/2019
Objetivo sucinto do programa: Reproduz uma lanchonete
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1038
*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		double id = entradaDados.nextInt();
		double quantidade = entradaDados.nextInt();
		
		if (id == 1) {
			id = 4.00;
		} else if (id == 2) {
			id = 4.50;
		} else if (id == 3) {
			id = 5.00; 
		} else if (id == 4) {
			id = 2.00;
		} else if (id == 5) {
			id = 1.50;
		} else {
			id = 0;
		}
		
		DecimalFormat formatador = new DecimalFormat("###0.00");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);
		
		double lanche = (id * quantidade);
		
		System.out.println("Total: R$ " + formatador.format(lanche));
	}
}
