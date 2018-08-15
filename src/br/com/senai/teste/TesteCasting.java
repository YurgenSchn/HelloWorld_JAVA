package br.com.senai.teste;

public class TesteCasting {

	public static void main(String[] args) {
		
		//Apesar 6 ser um inteiro o valor da vari�vel grande
		//Continua sendo do tipo long
		
		long grande = 6L;  //NUMEROS 'L' S� CABEM EM TIPOS LONG
		int pequeno = 16;
		
		float a = 12.121F;  //Correto 
		float b = 35.125F;	//35.125 � um double - PRECISA DO F
			
		
		//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=//
		//-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-//
		//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=//
		//+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+//
		
		int pequenoa= (int)99L; //Para definir um valor 'L' dentro de um tipo
								//que n�o suporta, � preciso fazer uma esp�cie
								//de convers�o, ou casting.
		double aa = 12.121;
		float  bb = (float)aa;
		
		System.out.println(bb);
	}
}
