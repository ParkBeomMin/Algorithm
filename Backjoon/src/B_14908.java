/*
 문제
지금 구두 수선공에게는 손님으로부터 주문 받고 제작해야 할 작업이 N개 쌓여있다. 구두 수선공은 하루에 한 작업만 수행할 수 있고, i번째 작업을 완료하는 데 Ti일이 걸린다. 이때 Ti는 정수이고 1 ≤ Ti ≤ 1000이다.

i번째 작업을 시작하기 전에 하루가 지연될 때마다 구두 수선공은 보상금 Si센트를 지불해야 한다. 이때 Si는 정수이고 1 ≤ Si ≤ 10000이다. 구두 수선공을 돕기 위해 최저 보상금을 지불하는 작업 순서를 정해야 한다.

하루에 2개 이상의 작업을 동시에 수행할 수 없다. 작업 i를 수행하고 있는 경우, 작업 i를 마칠 때 까지 작업 i 외의 다른 작업을 수행할 수 없다.

입력
1 ≤ N ≤ 1000 범위의 정수 N이 첫 번째 줄에 주어진다. 다음 N개 줄에 걸쳐서 첫 번째 열에는 T1 … TN이 입력되며, 두 번째 열에는 S1 … SN이 주어진다.

출력
최소 보상금을 지불하는 작업 순서를 출력해야 한다. 모든 작업은 입력에서의 번호(1~N)로 표시해야 한다. 모든 정수는 한 줄로 표시해야 하며, 각 작업은 공백 문자로 구분한다. 여러 가지 해답이 나올 수 있다면 오름차순 정렬에 의해 가장 첫 번째 해답을 출력한다.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class B_14908 {
	public void solution() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] arr = new int[N][2];
		int[][] tmp = new int[N][2];
		ArrayList result = new ArrayList();
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 2; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < 2; j++) {
				tmp[i][j] = arr[i][j];
			}
		}
		
		
		
		for(int i = 0; i < N; i++) {

			int max = 0;
			int maxIndex = 0;
			for(int j = 0; j < N; j++) {
				max = arr[i][0];
				if(max < arr[j][0]) {
					max = arr[j][0];
				}
				tmp[i][1] = tmp[i][1] + arr[i][1]*arr[j][0];
				if(max < tmp[j][1]) {
					max = tmp[j][1];
					maxIndex = j;
}
			}
			for(int k = 0; k < N; k++) {
				tmp[k][1] = arr[k][1] + arr[k][1]*arr[maxIndex][0];
			}
			arr[maxIndex][1] = 0;
			arr[maxIndex][0] = 0;
			result.add(maxIndex+1);
			
			
		}
		
		for(int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}
	}

}
