package com.javatest.ex;

public class Calculator {
	public void addition(int firstNum, int secondNum) {
		System.out.println("µ¡¼À °á°ú Ãâ·Â : ");
		int result = firstNum + secondNum;
		System.out.println(firstNum + "+" + secondNum + "=" + result);
	}	
	
	public void subtraction(int firstNum, int secondNum) {
		System.out.println("»¬¼À °á°ú Ãâ·Â : ");
		int result = firstNum - secondNum;
		System.out.println(firstNum + "-" + secondNum + "=" + result);
	}

	public void multiplication(int firstNum, int secondNum) {
		System.out.println("°ö¼À °á°ú Ãâ·Â : ");
		int result = firstNum * secondNum;
		System.out.println(firstNum + "*" + secondNum + "=" + result);
	}
	
	public void division(int firstNum, int secondNum) {
		System.out.println("³ª´°¼À °á°ú Ãâ·Â : ");
		int result = firstNum / secondNum;
		System.out.println(firstNum + "/" + secondNum + "=" + result);
	}
}
