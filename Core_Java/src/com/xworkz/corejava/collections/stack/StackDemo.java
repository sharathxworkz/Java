package com.xworkz.corejava.collections.stack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {	
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		stack.push(10);
		stack.push(7);
		stack.push(17);
		stack.push(77);
		
		System.out.println(stack);
		
		System.out.println(stack.search(0));
		
		
		
	}

	
}
