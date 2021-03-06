package com.algorithm.boj.silver;

import java.util.Scanner;
import java.util.Stack;

/**
 * @see <a href="https://www.acmicpc.net/problem/9012"/> 문제주소 </a>
 * 백준 / 9012 / 괄호
 */
public class B9012 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(parenthesis(sc.next()));
        }
    }

    public static String parenthesis(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (stack.empty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }

        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}