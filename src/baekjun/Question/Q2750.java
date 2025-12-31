package baekjun.Question;
import java.util.*;
public class Q2750 {
//	N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
//	입력
//	첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다.
//	이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
//	출력
//	첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		if(!input.hasNextInt())return;
		int n = input.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =0;i<n;i++) {
			int num = input.nextInt();
			list.add(num);
		}
		//n개의 숫자를 추가해준다 
		Collections.sort(list);
		for(int a:list) {
			System.out.println(a);
		}
		
	}

}
