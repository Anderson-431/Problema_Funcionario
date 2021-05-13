package app;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digiti os dados do funcion�rio");
		System.out.print("Funcion�rio: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Sal�rio Bruto: ");
		funcionario.SalarioBruto = sc.nextDouble();
		System.out.print("Taxa: ");
		funcionario.taxa = sc.nextDouble();
		
		System.out.println();
		System.out.println(funcionario);
		
		System.out.println();
		System.out.print("Qual a porcentagem de aumento de sal�rio? ");
		double porcentagem = sc.nextDouble();
		funcionario.AumentoSalarial(porcentagem);
		
		System.out.println();
		System.out.print("Sal�rio atualizado: " + funcionario);
		
		
		sc.close();
	}

}
