import java.util.Scanner;

public class B_14910 {
	public void solution() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] tmp = input.split(" ");
		int[] N = new int[tmp.length];
		int i = 0;
		String result = "Good";
		
		// 문자열로 받은 입력값을 정수 배열에 담아준다. 
		for(String num: tmp) {
			N[i] = Integer.parseInt(num);
			i++;
		}
		
		for(i = 0; i < N.length-1; i++) {
			if(N[i] > N[i+1]) {
				result = "Bad";
			}
		}
		
		System.out.println(result);
		scan.close();
				
	}
}
