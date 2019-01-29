/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 29/01/2019
Objetivo sucinto do programa: Calcula o imposto de renda
Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1051
*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class ImpostoDeRenda {

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);

		float renda = Float.parseFloat(entradaDados.next());
		double imposto = 0f;

		if (renda <= 2000) {
			imposto = 0;
		} else if (renda > 2000 && renda <= 3000) {
			imposto = (renda - 2000f) * 0.08f;
		} else if (renda > 3000 && renda <= 4500) {
			imposto = (renda - 3000f) * 0.18f + (1000f * 0.08f);
		} else if (renda > 4500) {
			imposto = (renda - 4500f) * 0.28f + (1500f * 0.18f) + (1000f * 0.08f);
		}
		
		DecimalFormat formatador = new DecimalFormat("#.00");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);
		
		if (imposto == 0 && imposto <= 2000.00){
			System.out.println("Isento");
		} else {
			System.out.println("R$ " + formatador.format(imposto));
		}
	}
}