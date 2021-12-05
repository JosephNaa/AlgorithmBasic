package js.pekah.basic;

public class ComputeCumulativeSum {
	public static void main(String[] args) {
		int[] FREQ = {1, 0, 7, 5, 4};
		int[] CUME;
		
		CUME = computeCumulativeSum(FREQ);
		
		System.out.println("배열 CUME: ");
		
		for (int i = 0; i < CUME.length; i++) {
			System.out.print(CUME[i] + "\t");
		}
	}
	
	public static int[] computeCumulativeSum(int[] FREQ) {
		int n = FREQ.length;
		int[] CUME = new int[n];
		
		CUME[0] = FREQ[0];
		
		for (int i = 1; i < n; i++) {
			CUME[i] = CUME[i - 1] + FREQ[i];
		}
		
		return CUME;
	}
}
