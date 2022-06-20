package infosys;
import java.util.Scanner;

public class DigitalOTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		String result = "";
		
		for(int i = 1; i < num.length() && result.length() < 4 ; i = i+2) {
			char ch = num.charAt(i);
			int n = Character.getNumericValue(ch);
			int sq = n*n;
			result = result+sq;
		}
		System.out.println(result);
		System.out.println("Required OTP: " + result.substring(0, 4));

	}

}
