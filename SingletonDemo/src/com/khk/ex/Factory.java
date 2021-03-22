
  package com.khk.ex;

	/*to design singleton java class with minimal standerd
	1. Class must be public (to make it visible outside the package
	2. declare private constructor(s) (to stop new operator based object creation outside of the class)
	3. define static factory method (to check and create, return that single object)
	4. declare private static  INSTANCE reference variale of same  class ( to hold that object reference for the verification of the object creation )
	USE CASE: e.g. to make all the employee company using same printer,we must printer class as singleton class. */
  
  
 //#1. Class must be public (to make it visible outside the package 
  public class Factory {
	  //#4. declare private static  INSTANCE reference variale of same  class
	  private static Factory INSTANCE;

	  //	#2. declare private constructor(s) (to stop new operator based object creation outside of the class)  
	  private Factory() {
		
	  }
	  
	  //# 3. define static factory method (to check and create, return that single object)	
	  public static Factory getFactory() {
		  if(INSTANCE==null)
			  return INSTANCE=new Factory();
		return INSTANCE;
		 
	  }
	  
	  
	  
  }
 
