package com.khk.ex;

public class MultithreadSynchroPrinter {
  private static MultithreadSynchroPrinter MSPRINTER ;
  private MultithreadSynchroPrinter() {
	  System.out.println("Constructor executed");
	 }
  public static MultithreadSynchroPrinter getInstance() {
	 if(MSPRINTER==null) {
		 
		 synchronized (MultithreadSynchroPrinter.class) {
			 if(MSPRINTER==null)
				 MSPRINTER =new MultithreadSynchroPrinter();
		}
		 
	  }  
	 return MSPRINTER;
  }
}

