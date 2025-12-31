package baekjun.Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q1920 {
//	첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 
//	다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 
//	이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String fLine = input.readLine();
		int n = Integer.parseInt(fLine);
		HashSet<Integer> list = new HashSet<>();
		String mainList =input.readLine();
		StringTokenizer fList = new StringTokenizer(mainList);
		for(int i=0;i<n;i++) {
			list.add(Integer.parseInt(fList.nextToken()));
		}
		
		
		String sLine = input.readLine();
		int m = Integer.parseInt(sLine);

		HashSet<Integer> list2 = new HashSet<>();
		String targetList =input.readLine();
		StringTokenizer sList = new StringTokenizer(targetList);
		for(int i=0;i<m;i++) {
			list2.add(Integer.parseInt(sList.nextToken()));
		}

		
	}

}
