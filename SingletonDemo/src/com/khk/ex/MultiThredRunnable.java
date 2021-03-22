package com.khk.ex;

public class MultiThredRunnable implements Runnable {

	@Override
	public void run() {
		MultithreadSynchroPrinter msp1=MultithreadSynchroPrinter.getInstance();
		System.out.println(msp1.hashCode());
		
	}

}
