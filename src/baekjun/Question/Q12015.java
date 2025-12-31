package baekjun.Question;
import java.util.*;
public class Q12015 {
	// 이 경우에는 변환 없이 그대로 return list; 가 가능합니다.
	public static ArrayList<Integer> subsequence(ArrayList<Integer> list, int length) {
	    ArrayList<Integer> partList = new ArrayList<>();
	    
	    for (int i = 0; i <= list.size() - length; i++) {
	        for (int j = i; j < i + length; j++) {
	            partList.add(list.get(j));
	        }
	        return partList; 
	    }
	    return partList;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		if(!input.hasNextInt())return;
		int n = input.nextInt();
		ArrayList<Integer>list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(input.nextInt());
		}
				
		// Integer를 담는 게 아니라, ArrayList<Integer>를 담는 리스트로 선언
		ArrayList<ArrayList<Integer>> partList = new ArrayList<>(); 

		for(int i = 0; i < list.size(); i++) {
		    // 이제 subsequence가 반환하는 리스트를 통째로 저장할 수 있습니다.
		    partList.add(subsequence(list, i)); 
		}
		System.out.println(partList); 
		// 출력 결과 예시: [[1], [1, 2], [1, 2, 3]]
	}

}
