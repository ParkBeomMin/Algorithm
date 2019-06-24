import java.util.Scanner;
public class B_10610 {
	public static void solution() {
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
		int[] arr = new int[10];
		String result = "";
		long sum = 0;
		for(int i = 0; i < n.length(); i++) {
			int num = Integer.parseInt(n.substring(i, i+1));
//					Character.getNumericValue(n.charAt(i)); -> 시간이 더 오래 걸린다..
			arr[num]++;
			sum += num;
		}
		if(arr[0] == 0 || sum % 3 != 0) {
			result = "-1";
		}else {
				for(int i = arr.length-1; i >= 0; i--) {
					while(arr[i] > 0) {
						result += i;
						arr[i]--;
					}
				}
		}
		
		System.out.println(result);
		scan.close();
	}
}
