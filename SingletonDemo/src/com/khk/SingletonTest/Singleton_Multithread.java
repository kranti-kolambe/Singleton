package com.khk.SingletonTest;

import com.khk.ex.MultiThredRunnable;

public class Singleton_Multithread {

	public static void main(String[] args) {
		MultiThredRunnable mtr=new MultiThredRunnable();
		MultiThredRunnable mtr1=new MultiThredRunnable();
		MultiThredRunnable mtr2=new MultiThredRunnable();
		Thread t1=new Thread(mtr);
		Thread t2=new Thread(mtr1);
		Thread t3=new Thread(mtr2);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
