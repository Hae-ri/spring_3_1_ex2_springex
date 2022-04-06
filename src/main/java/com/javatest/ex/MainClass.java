package com.javatest.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// applicationCTX.xml�� ��ü������ �س��� ������ new�� ��ü �������� ����
		// MyCalculator myCalc = new MyCalculator();
		// myCalc.setCalculator(new Calculator());
		
		//myCalc.setFirstNum(10);
		//myCalc.setSecondNum(20);
		
		//myCalc.add();
		//myCalc.sub();
		//myCalc.mul();
		//myCalc.div();
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);

		MyCalculator myCalculation = ctx.getBean("mycalculator", MyCalculator.class); // applicationCTX.xml�� ������ �� ���̵�
		
		myCalculation.add();
		myCalculation.sub();
		myCalculation.mul();
		myCalculation.div();
		
		ctx.close();
	}
}