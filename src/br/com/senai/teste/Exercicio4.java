package br.com.senai.teste;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int i = 1;
		
		boolean a = (1>2);
		System.out.println("a) (1>2)              = " + a);
		
		boolean b = (8==8);
		System.out.println("b) (8==8)             = " + b);
		
		boolean c = ((12-5)>6);
		System.out.println("c) ((12-5)>6)         = " + c);
		
		boolean d = ((0<3) && (8<9));
		System.out.println("d) ((0<3) && (8<9))   = " + d);
		
		boolean e = ((i++)>i);
		System.out.println("e) ((i++)>i)          = " + e);
		
		boolean f = ((10*90/50-2)==16);
		System.out.println("f) ((10*90/50-2)==16) = " + f);
	}
}
