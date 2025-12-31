package baekjun.Question;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q10828 {
    public static void main(String[] args) throws IOException {
    	Scanner input = new Scanner(System.in);
    	Stack<Integer> stack = new Stack<>();

       
        if(!input.hasNextInt())return;
        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++) {
            StringTokenizer inputCmd = new StringTokenizer(input.nextLine());
            if (!inputCmd.hasMoreTokens()) continue;

            String command = inputCmd.nextToken();

            switch (command) {
                case "push":
                    stack.push(Integer.parseInt(inputCmd.nextToken()));
                    break;
                case "pop":                 
                    System.out.println(stack.isEmpty() ? "-1" : stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.isEmpty() ? "1" : "0");
                    break;
                case "top":
                    System.out.println(stack.isEmpty() ? "-1" : stack.peek());
                    break;
            }
        }
    }
}