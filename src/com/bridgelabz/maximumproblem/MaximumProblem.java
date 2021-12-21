package com.bridgelabz.maximumproblem;

public class MaximumProblem {
	
	public static void main(String[] args) {
		
		Operation operation = new Operation();
		
		operation.getInputForInteger();
		int integerMax =operation.testMaximum(operation.firstNumber,operation.secondNumber,operation.thirdNumber);
		System.out.println(integerMax+" is maximum amongst integer numbers");
		
		operation.getInputForFloat();
		float floatMax =operation.testMaximum(operation.number1,operation.number2,operation.number3);
		System.out.println(floatMax+" is maximum amongst float numbers");
		
		operation.getInputForString();
		String stringMax=operation.testMaximum(operation.string1,operation.string2,operation.string3);
		System.out.println(stringMax+" is maximum amongst strings");
		
	}

}

	