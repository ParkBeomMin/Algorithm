import java.util.Scanner;

public class B_14912 {
	public void solution() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] input_ = input.split(" ");
		int n = Integer.parseInt(input_[0]);
		int d = Integer.parseInt(input_[1]);
		int tmp = 0;
		int result = 0;
		for(int i = 1; i <= n; i++) {
			tmp = i;
			while(tmp > 0) {
//				System.out.println("tmp : " + tmp);
				if(tmp%10 == d) {
					result++;
//					System.out.println("result++ : " + result);
				}
				tmp /= 10;
//				System.out.println("tmp /= 10 : " + tmp);

			}
			
		}
		
		System.out.println(result);
		
	}
}
