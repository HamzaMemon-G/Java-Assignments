
public class exp1 {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Usage: java exp1 <n1> <n2>");
			return;
		}

		int n1, n2;
		try {
			n1 = Integer.parseInt(args[0]);
			n2 = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			System.out.println("Both arguments must be integers.");
			return;
		}

		int low = Math.min(n1, n2);
		int high = Math.max(n1, n2);

		java.util.List<Integer> primes = new java.util.ArrayList<>();
		for (int i = Math.max(2, low); i <= high; i++) {
			if (isPrime(i)) primes.add(i);
		}

		int count = primes.size();
		System.out.println("Primes between " + low + " and " + high + ":");
		if (count == 0) {
			System.out.println("None");
			System.out.println("Count: 0");
			System.out.println("No Fibonacci sequence can be generated because there are no primes in the range.");
			return;
		}

		for (int p : primes) System.out.print(p + " ");
		System.out.println();

		int smallest = primes.get(0);
		int largest = primes.get(primes.size() - 1);
		System.out.println("Smallest (a): " + smallest);
		System.out.println("Largest  (b): " + largest);
		System.out.println("Count: " + count);

		System.out.println("Fibonacci-like series (first = smallest, second = largest) of length " + count + ":");
		if (count == 1) {
			System.out.println(smallest);
			return;
		}

		long prev = smallest;
		long curr = largest;
		System.out.print(prev + " " + curr);
		for (int i = 3; i <= count; i++) {
			long next = prev + curr;
			System.out.print(" " + next);
			prev = curr;
			curr = next;
		}
		System.out.println();
	}

	private static boolean isPrime(int n) {
		if (n <= 1) return false;
		if (n <= 3) return true;
		if (n % 2 == 0) return false;
		int r = (int) Math.sqrt(n);
		for (int i = 3; i <= r; i += 2) {
			if (n % i == 0) return false;
		}
		return true;
	}
}

