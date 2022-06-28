package co.micol.prj0506.stack;

import java.util.Scanner;

public class StackExample {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int 
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("-----");
		stack.pop();
		stack.pop();
		stack.pop();

	}

}
