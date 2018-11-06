
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fibonacci number at 5th possition is:" + getFibonacci(5));
		System.out.println("Fibonacci number at 6th possition is:" + getFibonacci(6));
	}
	
	static int getFibonacci(int n) {
		int[] arr = new int[n+2];
		
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		return arr[n-1];
	
	}

}
