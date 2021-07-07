package test;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 5768;
		String number = String.valueOf(x);
		char[] digit = number.toCharArray();
		
		for(int x1=digit.length-1;x1>=0;x1--) {
			
			System.out.print(digit[x1]);
			
		}
		
		
	}

}
