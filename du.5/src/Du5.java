
public class Du5 {

	public static void main(String[] args) {
		int basicNumber=15724554;
		System.out.println("The basic number is : " +basicNumber);
		byte NumberByte= (byte) basicNumber;
		System.out.println("In byte : "+NumberByte);
		short ShortNumber= (short) basicNumber;
		System.out.println("In short : "+ShortNumber);
		long LongNumber= (long) basicNumber;
		System.out.println("In long : "+LongNumber);
		float DecimalNumber= (float) basicNumber;
		System.out.println("In float : "+DecimalNumber);
		double DoubleAccuracy= (double) basicNumber;
		System.out.println("In double : "+DoubleAccuracy);
		//boolean TrueFalse= (boolean) basicNumber;  // cannot cast boolean from int//
		char Character=(char) basicNumber;
		System.out.println("In char : "+Character);

	}

}
