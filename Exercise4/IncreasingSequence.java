final class IncreasingSequence {
	
	static boolean isIncreasing(int num) {
		
		int fourthNum;
		int thirdNum;
		int secondNum;
		int firstNum;
		
		fourthNum= num%10;
		num/= 10;
		thirdNum= num%10;
		num/= 10;
		secondNum= num%10;
		num/= 10;
		firstNum = num%10;
		
		return fourthNum > thirdNum && thirdNum > secondNum && secondNum > firstNum;  
		
	}

}