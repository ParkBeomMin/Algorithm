import java.util.Arrays;
import java.util.Scanner;
public class B_2217 {
	public void solution() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] rope = new int[N];
		int w = 0;
		for(int i = 0; i < N; i++) {
				rope[i] = scan.nextInt();	
		}
		Arrays.sort(rope);
		for(int i = 0; i < N; i++) {
			w = Math.max(w, rope[i]*(N-i));
		}
		System.out.println(w);
		scan.close();
	}
}
