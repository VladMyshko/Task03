final class MassConverter {

	private static final int FROM_KG_IN_MG = 1000000;
	private static final int FROM_KG_IN_G = 1000;
	private static final int FROM_KG_IN_T = 1000;
	
	static double convertToMg(double kg) {
		return kg*FROM_KG_IN_MG;
	}
	
	static double convertToG(double kg) {
		return kg*FROM_KG_IN_G;
	}
	
	static double convertToT(double kg) {
		return kg/FROM_KG_IN_T;
	}
}
