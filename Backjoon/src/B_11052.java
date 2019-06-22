import java.util.Scanner;
public class B_11052 {
	public void solution() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] price = new int[N+1];
		int[] result = new int[N+1];
		for(int i = 1; i <= N; i++) {
			price[i] = scan.nextInt();
		}
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				result[i] = Math.max(result[i], result[i - j] + price[j]);
			}
		}
		System.out.println(result[N]);
		scan.close();
	}
}
