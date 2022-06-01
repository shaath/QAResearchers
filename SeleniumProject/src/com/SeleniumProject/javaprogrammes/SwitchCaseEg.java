package com.SeleniumProject.javaprogrammes;

public class SwitchCaseEg {

	public static void main(String[] args) {
		
		String course = "Selenium";
		
		switch(course)
		{
		case "manual":
			System.out.println("You are selected Manual");
			break;
		case "Selenium":
			System.out.println("You are selected Selenium");
			break;
		case "UFT":
			System.out.println("You are selected UFT");
			break;
		default:
			System.out.println("Select a proper course");
			break;
		}

	}

}
