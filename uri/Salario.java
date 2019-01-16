/*
Nome do autor: F�bio Augusto Amaro Jaime
Data de cria��o do arquivo: 16/01/2019
Objetivo sucinto do programa: Calcula o sal�rio de um funcion�rio
Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1008
*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);

		int numeroFuncionario = entradaDados.nextInt();
		int horasTrabalhadas = entradaDados.nextInt();
		double salarioFuncionario = Double.parseDouble(entradaDados.next());

		DecimalFormat formatador = new DecimalFormat("#0.00");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);

		double salario = horasTrabalhadas * salarioFuncionario;
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.println("SALARY = U$ " + formatador.format(salario));
		entradaDados.close();
	}
}
