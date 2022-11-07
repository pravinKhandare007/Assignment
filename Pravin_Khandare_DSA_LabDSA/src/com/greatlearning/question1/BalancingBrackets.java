package com.greatlearning.question1;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackets {
	public static void main(String[] args) {

		String input = "([[{}]])";

		Boolean result = isBalancedString(input);
		if (result) {
			System.out.println("the entered string has Balanced Brackets");
		} else {
			System.out.println("the entered string do not contain balanced brackets");
		}
	}

	private static Boolean isBalancedString(String input) {
		Stack<Character> data = new Stack<Character>();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				data.push(ch);
				continue;
			}
			if (data.isEmpty()) {
				return false;
			}

			char matchCh = data.pop();
			switch (ch) {
			case ')':
				if (matchCh != '(') {
					return false;
				}
				break;

			case ']':
				if (matchCh != '[') {
					return false;
				}
				break;

			case '}':
				if (matchCh != '{') {
					return false;
				}
				break;
			}
		}
		return data.isEmpty();
	}
}
