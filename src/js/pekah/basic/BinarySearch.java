package js.pekah.basic;

public class BinarySearch {
	public static void main(String[] args) {
		int[] A = {10, 12, 13, 14, 18, 20, 
				25, 27, 30, 35, 40, 45, 47};
		int x = 18;
		int n = A.length;
		int location = binarySearch(A, 0, n - 1, x);
		
		System.out.println(x + "의 지수 = " + location);
	}
	
	public static int binarySearch(int[] A, int first, int last, int target) {
		int result;
		if (first > last) return -1;
		else {
			int mid = (first + last) / 2;
			if (target == A[mid]) result = mid;
			else if (target < A[mid]) {
				result = binarySearch(A, first, mid - 1, target);
			}
			else {
				result = binarySearch(A, mid + 1, last, target);
			}
		}
		
		return result;
	}
}
