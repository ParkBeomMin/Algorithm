import java.util.Scanner;
public class B_1463 {
	public void solution() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] result = new int[n+1];
		for(int i = 1; i <= n; i++) {
			if(i == 1) {
				result[i] = 0;
			}else {
				result[i] = result[i-1] + 1;
				if(i%2 == 0) {
					result[i] = Math.min(result[i], result[i/2] + 1);
				}
				if(i%3 == 0) {
					result[i] = Math.min(result[i], result[i/3] + 1);
				}
			}
		}
		System.out.println(result[n]);
		scan.close();
	}
}
