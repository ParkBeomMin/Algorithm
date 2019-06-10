import java.util.Scanner;
public class B_1149 {
	public void solution() {
		Scanner scan = new Scanner(System.in);
		int house_num = scan.nextInt();
		int[][] price = new int[house_num][3];
		int[][] result = new int[house_num][3];
		for(int i = 0; i < house_num; i++) {
			for(int j = 0; j < 3; j++) {
				price[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < house_num; i++) {
			if(i == 0) {
				result[i][0] = price[i][0];
				result[i][1] = price[i][1];
				result[i][2] = price[i][2];				
			}else {
				result[i][0] = Math.min(result[i-1][1], result[i-1][2]) + price[i][0];
				result[i][1] = Math.min(result[i-1][0], result[i-1][2]) + price[i][1];
				result[i][2] = Math.min(result[i-1][1], result[i-1][0]) + price[i][2];
			}
		}
//		for(int i = 0; i < house_num; i++) {
//			System.out.println(result[i][0] + " " + result[i][1] + " " + result[i][2]);
//		}
		System.out.println(Math.min(result[house_num-1][0], Math.min(result[house_num-1][1], result[house_num-1][2])));
		scan.close();
	}
}
