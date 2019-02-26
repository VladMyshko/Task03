final class Average {
	
	private static final int ARITHMETIC_AVERAGE_KOEF = 6;
	private static final double GEOMETRIC_AVERAGE_KOEF = (double) 1 / 6;
	
	static double arithmeticAverage(int num) {
		double average = 0;
				average +=num%10;
				num/=10;
				average +=num%10;
				num/=10;
				average +=num%10;
				num/=10;
				average +=num%10;
				num/=10;
				average +=num%10;
				num/=10;
				average +=num%10;
				average/=ARITHMETIC_AVERAGE_KOEF;
						return average;
	}
	
	static double geometricAverage(int num) {
		double average = 1;
		
		average *=num%10;
		num/=10;
		average *=num%10;
		num/=10;
		average *=num%10;
		num/=10;
		average *=num%10;
		num/=10;
		average *=num%10;
		num/=10;
		average *=num%10;
		average = Math.pow(average, GEOMETRIC_AVERAGE_KOEF);
		return average;
	}

}
