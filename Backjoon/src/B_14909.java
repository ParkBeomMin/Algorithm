/*
 문제
주어진 N개의 정수 중에서 양의 정수의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 최대 1,000,000개의 정수가 주어진다. 입력으로 주어지는 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같다.

출력
첫째 줄에 양의 정수의 개수를 출력한다.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class B_14909 {
	public void solution() {
		Scanner scan = new Scanner(System.in);
		int result = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String a = "";
			a = scan.nextLine();
		String[] a_ = a.split(" ");
		for(String num : a_) {
			arr.add(Integer.parseInt(num));
		}
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i) > 0) {
				result++;
			}
		}
		System.out.print(result);

	}
}
