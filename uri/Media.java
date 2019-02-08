/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 16/01/2019
Objetivo sucinto do programa: Calcula a media tal valor fornecido
Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1006
*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		
		float nota1 = Float.parseFloat(entradaDados.next());
		float nota2 = Float.parseFloat(entradaDados.next());
		float nota3 = Float.parseFloat(entradaDados.next());
		
		DecimalFormat formatador = new DecimalFormat("#0.0");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);
		
		float media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (3+2+5);
		System.out.println("MEDIA = " + formatador.format(media));
		entradaDados.close();
	} 

}
