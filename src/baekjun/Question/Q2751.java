package baekjun.Question;
import java.util.*;
public class Q2751 {
	public static ArrayList<Integer> swap(ArrayList<Integer>arr){
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		if(!input.hasNextInt())return;
		int n = input.nextInt();
		for(int i=0;i<n;i++) {
			list.add(input.nextInt());
		}
		Collections.sort(list);
		for(int a :list) {
			System.out.println(a);
		}
	}
	

}
