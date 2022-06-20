package infosys;
import java.util.*;
public class NthPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt(); // how many queries
		
		List<Integer> queries = new ArrayList<>();
		
		for (int i =0; i<q; i++) {
			queries.add(sc.nextInt());
		}
		
		int max = Collections.max(queries);
		System.out.println("max: " + max);
		
		List<Integer> primes = new ArrayList<>();
		primes.add(2);
		int num = 3;
		
		while(primes.size() < max) {	
			if(isPrime(num)) {
			   primes.add(num);
			}
			
			num++;
		}
		
		System.out.println(primes);
		
		for(Integer n : queries) {
			System.out.println(n + "th prime number is " + primes.get(n-1));
		}

	}

	private static boolean isPrime(int num) {
		
		for(int i = 2; i <= Math.sqrt(num); i++ ) {
			if (num%i == 0) {
				return false;
			}
		}
		return true;
	}

}
