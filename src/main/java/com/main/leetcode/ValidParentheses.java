package com.main.leetcode;

import java.util.Stack;

public class ValidParentheses {

  static boolean get(String s) {
    char[] charArray = s.toCharArray();
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < charArray.length; i++) {
      if (charArray[i] == '(' || charArray[i] == '{' || charArray[i] == '[') {
        stack.push(charArray[i]);
      } else {
        if (stack.empty()) {
          return false;
        } else if (charArray[i] == ')' && stack.pop() != '(') {
          return false;
        } else if (charArray[i] == '}' && stack.pop() != '{') {
          return false;
        } else if (charArray[i] == ']' && stack.pop() != '[') {
          return false;
        }
      }
    }
    return stack.empty();
  }

  public static void main(String[] args) {
    System.out.println(get("([}}])"));
  }

}
