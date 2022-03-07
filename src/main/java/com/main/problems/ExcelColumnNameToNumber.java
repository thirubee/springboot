package com.main.problems;

public class ExcelColumnNameToNumber {

  public static void main(String[] args) {

    final String columnName = "AAA";
    //result = result * 26 + str[i] - 'A' + 1;
    int number = 0;
    for(int i = 0; i< columnName.length(); i++){
      number *= 26;
      number += columnName.charAt(i) - 'A' + 1;
    }

    System.out.println(number);

  }

}
