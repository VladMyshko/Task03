final class Inversion {
	
	
	static int invert(int num) {
		int koef = 1000000;
		int inverted;
		
		inverted = num % 10 * koef;
		num /= 10;
		koef /= 10;
		inverted += num % 10 * koef;
		num /= 10;
		koef /= 10;
		inverted += num % 10 * koef;
		num /= 10;
		koef /= 10;
		inverted +=  num % 10 * koef;
		num /= 10;
		koef /= 10;
		inverted +=  num % 10 * koef;
		num /= 10;
		koef /= 10;
		inverted +=  num % 10 * koef;
		num /= 10;
		koef /= 10;
		inverted +=  num % 10 * koef;
		
		
		return inverted;
	}

}