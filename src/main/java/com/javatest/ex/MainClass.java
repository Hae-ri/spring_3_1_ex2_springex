package com.javatest.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// applicationCTX.xml에 객체생성을 해놨기 때문에 new로 객체 생성하지 않음
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

		MyCalculator myCalculation = ctx.getBean("mycalculator", MyCalculator.class); // applicationCTX.xml에 설정된 빈 아이디
		
		myCalculation.add();
		myCalculation.sub();
		myCalculation.mul();
		myCalculation.div();
		
		ctx.close();
	}
}