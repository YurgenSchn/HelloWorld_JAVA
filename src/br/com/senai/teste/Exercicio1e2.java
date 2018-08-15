package br.com.senai.teste;

public class Exercicio1e2 {

	public static void main(String[] args) {
		
		double h = 6.55;
		double b1 = 3.22;
		double b2 = 7.86;
		
		double res = (h*(b1+b2))/2;
		
		System.out.println("Area exata: " + res);
		
		int redondo = (int)res;
		
		System.out.println("Area arredondada: " + redondo);
	}
}
