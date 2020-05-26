public class Average_count {

	public static void main(String[] args) {

		Average_count obj = new Average_count();
		// obj.avg_cunt();
		// obj.incrr();
		// obj.exp();
		obj.summ2();

	}

	public void avg_cunt() {
		int sum = 0, count = 0;
		int[] sales = { 6, 9, 7, 10, 11, 9, 7, 12, 14, 15, 13, 11 };

		// Using while loop
		int index = 0;
		while (index < sales.length) {

			sum = sum + sales[index];
			// sum += sales[index];
			index++;
		}

		float average = (float) sum / sales.length;
		for (int sale : sales) {
			if (sale > average)
				count++;
		}
		System.out.println("Average sale: " + average);
		System.out.println("Sales above average: " + count);
	}

	public void incrr() {
		int a = 100;
		int b;
		int c;
		b = ++a;
		c = b++;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

//		 * 101 102 101 Explanation :	 * 
//		 * Java code executes in sequence in a function/method.
//		 * 
//		 * b=++a is prefix i.e., considered as a=a+1 and b=a
//		 * 
//		 * c=b++ is postfix i.e., considered as c=b and b=b+1

	}

	public void exp() {
		int i = 1, j = 10;
		do {
			if (i > j) {
				break;
			}
			j--;
		} while (++i < 5);

		System.out.println("i =" + i + " and j = " + j);
	}

	public void summ() {

		int sum = 0;
		for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1) {
			sum += i;
		}
		System.out.println(sum);

	}

	public void summ2() {
		for (int i = 0; i < 10; i += 2) {
			System.out.print(i + "");
			++i;
		}
	}
}
