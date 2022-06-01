package com.SeleniumProject.javaprogrammes;

public class InterfaceReuseEg {

	public static void main(String[] args) {
		
		InterfaceEg im1 = new InterfaceImplements1();
		
		im1.Vehicle();
		
		InterfaceEg im2 = new InterfaceImplements2();
		
		im2.Vehicle();	
	}
}
