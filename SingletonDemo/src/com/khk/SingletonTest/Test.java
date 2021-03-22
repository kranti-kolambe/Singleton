package com.khk.SingletonTest;

import com.khk.ex.Factory;
import com.khk.ex.MultithreadSynchroPrinter;

public class Test {

	public static void main(String[] args) {
		// #1 Factory method
		Factory f1=Factory.getFactory();
		Factory f2=Factory.getFactory();
		System.out.println("f1 "+f1.hashCode() +" f2 "+f2.hashCode());
		
		//#2 Multi-threaded environment 
		MultithreadSynchroPrinter msp1=MultithreadSynchroPrinter.getInstance();
		MultithreadSynchroPrinter msp2=MultithreadSynchroPrinter.getInstance();
		
		
		
	}

}
