package baekjun.Question;
import java.util.*;

public class Q14916 {
//	춘향이는 편의점 카운터에서 일한다.
//
//	손님이 2원짜리와 5원짜리로만 거스름돈을 달라고 한다. 2원짜리 동전과 5원짜리 동전은 무한정 많이 가지고 있다. 
//	동전의 개수가 최소가 되도록 거슬러 주어야 한다. 거스름돈이 n인 경우, 최소 동전의 개수가 몇 개인지 알려주는 프로그램을 작성하시오.
//
//	예를 들어, 거스름돈이 15원이면 5원짜리 3개를, 거스름돈이 14원이면 5원짜리 2개와 2원짜리 2개로 총 4개를, 
//	거스름돈이 13원이면 5원짜리 1개와 2원짜리 4개로 총 5개를 주어야 동전의 개수가 최소가 된다.
//	입력
//	첫째 줄에 거스름돈 액수 n(1 ≤ n ≤ 100,000)이 주어진다.
//	출력
//	거스름돈 동전의 최소 개수를 출력한다. 만약 거슬러 줄 수 없으면 -1을 출력한다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,2));
		
		Scanner input = new Scanner(System.in);
		if(!input.hasNextInt())return;
		int money  = input.nextInt(); /*13*/
		ArrayList<int[]> listResult = new ArrayList<>();
		int max5=money/list.get(0);
		int max2=money/list.get(1);
		for(int i=0;i<=max5;i++) {
			for(int j=0;j<=max2;j++) {
				if(((list.get(0)*i)+(list.get(1)*j)) ==money) {
					listResult.add(new int[]{i, j});				}
			}
		}
		if (listResult.isEmpty()) {
            System.out.println(-1);
        } else {
            int[] lastMin = listResult.get(listResult.size() - 1);
            int result = lastMin[0] + lastMin[1];
            System.out.println(result);
        }
		}

}
