import java.util.Scanner;
public class B_2579 {
	public void solution() {
		Scanner scan = new Scanner(System.in);
		int stairs = scan.nextInt();
		int[] score = new int[stairs];
		int[] result = new int[stairs];
		for(int i = 0; i < stairs; i++) {
			score[i] = scan.nextInt();
			result[i] = score[i];
		}
		result[1] = Math.max(score[1], score[0] + score[1]);
		result[2] = Math.max(score[0] + score[2], score[1] + score[2]);
		for(int i = 3; i < stairs; i++) {
			result[i] = Math.max(result[i-3] + score[i-1] + score[i], result[i-2] + score[i]);
		}
		System.out.println(result[stairs-1]);
		scan.close();
	}
}
