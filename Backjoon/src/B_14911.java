import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class B_14911 {
	public void solution() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int sum = scan.nextInt();
		String[] tmp = input.split(" ");
		int[] arr = new int[tmp.length];
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int result = 0;
		for(int i = 0; i < tmp.length; i++) {
			arr[i] = Integer.parseInt(tmp[i]);
		}
		
		// 오름차순으로 정
		Arrays.sort(arr);

		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] + arr[j] == sum) {
						answer.add(arr[i]);
						answer.add(arr[j]);
					result++;
				break;
				}
			}
		}
		
		for(int i = 0; i < answer.size()-1; i+=2) {
			System.out.println(answer.get(i) + " " + answer.get(i+1));
		}
		System.out.println(result);
		scan.close();
	}
}
