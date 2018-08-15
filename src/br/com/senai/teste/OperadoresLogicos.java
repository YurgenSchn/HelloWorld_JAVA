package br.com.senai.teste;

public class OperadoresLogicos {

	public static void main(String[] args) {
		int mes = 3;
		
		if ((mes == 12) || (mes ==1)) 
		{
			System.out.println("férias TOPppo");
		}
		
		if ((mes > 1) && (mes < 12))
		{
			System.out.println("Semestre em andamento s/2");
		}
		
		if (mes!= 2) 
		{
			System.out.println("Não tem carnaval");
		}
	}
}
