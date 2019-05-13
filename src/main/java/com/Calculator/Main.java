package com.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
	 private static void pressAnyKeyToContinue()
	 { 
	        System.out.println("Press Enter key to continue...");
	        try
	        {
	            System.in.read();
	        }  
	        catch(Exception e)
	        {}  
	 }

	public static void main(String[] args) throws InterruptedException, IOException {
		Boolean state = true;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (state) {

			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("Calculator\n");
			System.out.println("Pick action from list:");
			System.out.println("1) Add");
			System.out.println("2) Substract");
			System.out.println("3) Multiply");
			System.out.println("4) Divide");
			System.out.println("0) Exit");

			Double numberA, numberB;
			
			String choice = reader.readLine();
			
			switch (choice) {
			case "1":
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("ADD\n");
				System.out.println("Please insert first number");
				numberA = Double.parseDouble(reader.readLine());
				System.out.println("Please insert second number");
				numberB = Double.parseDouble(reader.readLine());
				System.out.println(numberA + " + " + numberB + " = " + Calculator.add(numberA, numberB));
				pressAnyKeyToContinue();
				break;

			case "2":
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("SUB\n");
				System.out.println("Please insert first number");
				numberA = Double.parseDouble(reader.readLine());
				System.out.println("Please insert second number");
				numberB = Double.parseDouble(reader.readLine());
				Calculator.sub(numberA, numberB);
				System.out.println(numberA + " - " + numberB + " = " + Calculator.add(numberA, numberB));
				pressAnyKeyToContinue();
				break;

			case "3":
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("MUL\n");
				System.out.println("Please insert first number");
				numberA = Double.parseDouble(reader.readLine());
				System.out.println("Please insert second number");
				numberB = Double.parseDouble(reader.readLine());
				Calculator.mul(numberA, numberB);
				System.out.println(numberA + " * " + numberB + " = " + Calculator.add(numberA, numberB));
				pressAnyKeyToContinue();
				break;

			case "4":
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("DIV\n");
				System.out.println("Please insert first number");
				numberA = Double.parseDouble(reader.readLine());
				System.out.println("Please insert second number");
				numberB = Double.parseDouble(reader.readLine());
				Calculator.div(numberA, numberB);
				System.out.println(numberA + " / " + numberB + " = " + Calculator.add(numberA, numberB));
				pressAnyKeyToContinue();
				break;

			case "0":
				state = false;
				break;
			}

		}
	}
}
