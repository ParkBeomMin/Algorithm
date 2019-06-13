import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class B_1931 {
	public void solution() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<MeetTime> arr = new ArrayList();
		for(int i = 0; i < N; i++) {
			arr.add(new MeetTime(scan.nextInt(), scan.nextInt()));
		}
		
        Collections.sort(arr);
        
        int result = 0;
        int prevEnd = 0;
        for(MeetTime t:arr) {
            if(prevEnd <= t.getStartTime()) {
                    result += 1;
                    prevEnd = t.getEndTime();
            }
        }
        System.out.println(result);
		scan.close();
	}
	
	 
}

class MeetTime implements Comparable<MeetTime>{
	private int start;
	private int end;
	public MeetTime(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	int getStartTime() {
		return this.start;
	}
	int getEndTime() {
		return this.end;
	}
	public String toString() {
	        return "start : " + this.start + " end : " + this.end;
	}

	@Override
	public int compareTo(MeetTime o) {
		// TODO Auto-generated method stub
		if(this.end < o.getEndTime()) {
			return -1;
		}else if(this.end == o.getEndTime()) {
            if(this.start < o.getStartTime()) {
                return -1;
            }else if(this.start == o.getStartTime()) {
                return 0;
            }else {
                return 1;
            }
        }else {
            return 1;
        }
	}
	
	
}