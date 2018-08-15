package br.com.senai.teste;

public class TesteString {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String disciplina = "Sistemas Orientados a Objetos I";
		String disciplina_a = "Programação de Aplicativos - SENAI";
		
		System.out.println("disciplina: " + disciplina);
		
		//ISOLANDO UM CARACTERE
		
		System.out.print("Primeiro Caractere: ");
		System.out.println(disciplina.charAt(0));
		System.out.print("Segundo Caractere: ");
		System.out.println(disciplina.charAt(1));
		
		//O PRIMEIRO CARACTERE DE UMA STRING TEM INDICE 0, O SEGUNDO TEM 2...
		
		//LETRA = 'S';
		char letra = disciplina.charAt(2);
		
		//substrings
		System.out.print("primeiras cinco letras: ");
		System.out.println(disciplina.substring(0,5));
		System.out.print("letras a partir da quarta: ");
		System.out.println(disciplina.substring(4));
		System.out.print("Primeiras sete letras da variavel_a: ");
		System.out.println(disciplina_a.substring(0,7));
		//Número de caracteres em uma String:
		System.out.print("Tamanho da frase: ");
		System.out.println(disciplina.length());
		System.out.print("Tamanho da frase_a: ");
		System.out.println(disciplina_a.length()		+ " letras"
				+ " \n" //COLOCAR ISSO DENTRO DO STRING PULA A LINHA
				+ " Nova linha\ttabulação"
				);

			
	}
}
