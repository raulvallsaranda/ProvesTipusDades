package com.raul.provestipusdades;

public class ProvesCaracter {

	public static void main(String[] args) {
		System.out.println('a');
		System.out.println('4');
		System.out.println('\u2764'); //cor
		//ascii
		System.out.println('\u0013'); // control
		System.out.println('\u0024'); // dòlar
		System.out.println('\u00d8'); // buit
		//unicode
		System.out.println("\uD83C\uDF44"); // bolet
		System.out.println("\uD83E\uDD76"); // cara gelada
		
		//operacions
		//lògiques
		System.out.println('a' == 'a');
		System.out.println('a' != 'a');
		System.out.println('z' > 'w');
		System.out.println('k' < 'b');
		//aritmètiques
		System.out.println('a'+1);
		System.out.println('a'+'b');
		System.out.println('a'*'b'-'c');
		
		System.out.println (97);
		System.out.println ((char) 369995);
		
	}

}
