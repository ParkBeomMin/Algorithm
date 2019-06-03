import java.util.Scanner;

public class B_11047 {
	public void solution() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[] value = new int[N];
		int result = 0;
		for(int i = 0; i < N; i++) {
			value[i] = scan.nextInt();
		}
		for(int i = N-1; i >= 0; i-- ) {
			if(value[i] <= K) {
				result += K/value[i];
				K %= value[i];
			}
		}
		System.out.println(result);
		scan.close();
	}
}
