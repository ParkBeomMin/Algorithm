import java.util.Scanner;
public class B_2193 {
	public static void solution() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long[] result = new long[N+1];
		result[0] = 0;
		result[1] = 1; // n = 1, 1
		for(int i = 2; i <= N; i++) {
			result[i] = result[i-1] + result[i-2];
		}
		System.out.println(result[N]);
		scan.close();
	}
}
