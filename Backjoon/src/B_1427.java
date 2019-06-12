import java.util.Scanner;
public class B_1427 {
	public void solution() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String tmp = String.valueOf(N);
		int[] result = new int[tmp.length()];
		for(int i = 0; i < tmp.length(); i++) {
			result[i] = Character.getNumericValue(tmp.charAt(i));
		}
		for(int i = 0; i < tmp.length(); i++) {
			for(int j = 0; j < tmp.length()-i-1; j++) {
				if(result[j] < result[j+1]) {
					int tmpInt = result[j];
					result[j] = result[j+1];
					result[j+1] = tmpInt;
				}
			}
		}
		for(int i = 0; i < tmp.length(); i++) {
			System.out.print(result[i]);
		}
		scan.close();
	}
}
