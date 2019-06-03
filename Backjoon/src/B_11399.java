import java.util.Arrays;
import java.util.Scanner;
public class B_11399 {
	public void solution() {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] line = new int[num];
		int result = 0;
		
		for(int i = 0; i < num; i++) {
			line[i] = scan.nextInt();
		}
		
		Arrays.sort(line);
		
		
		result = line[0];
		for(int i = 1; i < line.length; i++) {
			line[i] = (line[i] + line[i-1]);
			result += line[i];
		}
		
		System.out.println(result);
		scan.close();
	}
}
