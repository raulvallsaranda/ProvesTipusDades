package com.raul.provestipusdades;

public class ProvesReal {

	public static void main(String[] args) {
		System.out.println(3.252423); System.out.println(-4.00000000000001);
		System.out.println(3.252423f); System.out.println(-4.00001F);
		
		//operacions
		System.out.println(8.5 + 3.2);
		System.out.println(5.66 - 3.1);
		System.out.println(3.1 * 8.4);
		System.out.println(17.0 / 4.0f);
		System.out.println(1.2 == 1.2 );
		System.out.println(-4.3 > -12.45);
		System.out.println(3.14 < 5.126);
		
		double variableDouble = 100;
		float variableFloat = (float) variableDouble;
		System.out.println(variableFloat);

	}

}
