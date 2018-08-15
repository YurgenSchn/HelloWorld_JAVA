package br.com.senai.teste;

public class TesteCasting {

	public static void main(String[] args) {
		
		//Apesar 6 ser um inteiro o valor da variável grande
		//Continua sendo do tipo long
		
		long grande = 6;
		//int pequeno = 16L;
		
		float a = 12.121F;  //Correto
		//float b = 35.125;	//35.125 é um double - incorreto
		
		long grandea = 6;
		int pequenoa= (int)99L;
		float aa=12.121F;
		float bb= (float)aa;
		
		System.out.println(bb);
	}
}
